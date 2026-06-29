import java.util.*;
import java.io.*;
public class theconspiracyfiles 
{
    static public ObjectInputStream oin;
    static HashMap<String,HashMap<String,String>> d = new HashMap<>();
    static Scanner sc =new Scanner(System.in);
    //listing cases
    static String viewcases() throws FileNotFoundException,IOException
    {
        FileInputStream fr = new FileInputStream("case.txt");
        oin= new ObjectInputStream(fr);
        String ch="0";
        String ck="0";
        while(true) 
        {
            try
            {
                d=(HashMap<String,HashMap<String,String>>) oin.readObject();
                System.out.println(d.get("caseinfo").get("caseid")+'\t'+d.get("caseinfo").get("title"));
                ck=d.get("caseinfo").get("caseid");
            }
            catch (Exception e)
            {
                break;
            }           
        }
        System.out.print("Pick a case to solve: ");
        ch = sc.nextLine();
        if((int)ch.charAt(0)> (int)ck.charAt(0)){System.out.println("NO CASE AVAILABLE");}
        oin.close();
        fr.close();
        return ch;
    }

    static void play(String cid) throws FileNotFoundException,IOException
    {
        FileInputStream fr = new FileInputStream("case.txt");
        oin= new ObjectInputStream(fr);
        System.out.println("LOADING........");

        while(true) 
        {
            try
            {
                d=(HashMap<String,HashMap<String,String>>) oin.readObject();
                if (d.get("caseinfo").get("caseid").equals(cid))
                {
                   System.out.println("CASE ID: "+d.get("caseinfo").get("caseid"));
                   System.out.println();
                   System.out.println(d.get("caseinfo").get("title").toUpperCase());
                   System.out.println("Story: "+d.get("caseinfo").get("story"));
                   System.out.println();
                   while(true)
                   {
                      System.out.println("------------------------NAVIGATE-----------------------------");
                      System.out.println("\n1 -> Investigate Location\n2 -> Question suspects\n3 -> Hint\n4 -> Submit answer\n==> Enter 0 to give up");
                      System.out.print("COMMAND ---> ");
                      int c =sc.nextInt();
                      sc.nextLine();
                      System.out.println("\n************************************************************");
                      if(c==0)
                      {
                        System.out.println("CASE ABANDONED");
                        return;
                      }
                      switch(c)
                      {
                      case 1:
                      {
                        for(Map.Entry<String,String> e:d.get("locations").entrySet())
                        {
                            System.out.println("Location: "+e.getKey());
                            System.out.println("Evidence: "+e.getValue());
                            System.out.println("==============================");
                        }
                        break;
                      }
                      case 2:
                      {
                        for(Map.Entry<String,String> e:d.get("suspect").entrySet())
                        {
                            System.out.println("suspect name: "+e.getKey());
                            System.out.println(e.getValue());
                            System.out.println("==============================");
                        }
                        break;
                      }
                      case 3:
                      {
                        for(Map.Entry<String,String> e:d.get("clue").entrySet())
                        {
                            System.out.println("evidence: "+e.getKey());
                            System.out.println("Description: "+e.getValue());
                            System.out.println("==============================");
                        }
                        break;
                      }
                      case 4:
                      {
                        System.out.print("who is guilty --> ");
                        String ans = sc.nextLine();
                        if(ans.toLowerCase().equals(d.get("caseinfo").get("criminal")))
                        {
                            System.out.println("I KNEW U WILL FIND --- HATS OFF DEDECTIVE !!!");
                        }
                        else
                        {
                            System.out.println("YOU GUESSED WRONG !!!!");
                        }
                        break;
                      }  

                    }
                    if(c==4)
                    {
                        break;
                    }
                    
                    if(c>4)
                    {
                        System.out.println("INVALID COMMAND");
                        continue;
                    }
                   }
                   System.out.println("\nItz---> "+d.get("caseinfo").get("criminal") +"\n"+ d.get("caseinfo").get("solution"));
                   break;
                }  
            }
            catch (Exception e)
            {
                oin.close();
                fr.close();
                break;
            }
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("|                 THE CONSPIRACY FILES                      |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println();
        System.out.println("Welcome DETECTIVE "+(char)19);
        System.out.println();
        try
        {
            String cid = viewcases();
            System.out.println("============================================================");
            play(cid);
            System.out.println("============================================================");
            System.out.println("\t\t\tGREAT WORK");

        }
        catch(Exception e)
        {}
        


    }
    
}
