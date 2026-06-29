import java.util.Scanner;


public class minipasswordlocker 
{
    public static void main(String[] args) throws Exception
    {
      int a,ch;
      verify v = new verify() ;
      Scanner sc=new Scanner(System.in);
      a=v.getauth();
      if(a==1)
      {
         System.out.println("\t---> 1.SAVE PASSWORD");
         System.out.println("\t---> 2.GET PASSWORD");
         System.out.print("Enter your choice: ");
         ch=sc.nextInt();
         sc.nextLine();
         if(ch==1)
         { 
            try
            {
               func fn=new func() ;
               fn.add();
            }
           catch(Exception e)
            {}
         }
         else if(ch==2)
         {
           try
            {
               func fn=new func() ;
               fn.search();
            }
            catch(Exception e)
            {e.printStackTrace();}
         }
         System.out.println("\n=============================================================");
         System.out.println("\t\tTHANK YOU");
      }



    }  
} 
