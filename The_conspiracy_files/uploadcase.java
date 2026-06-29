import java.util.*;
import java.io.*;
public class uploadcase
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileOutputStream fw =new FileOutputStream("case.txt");
        ObjectOutputStream oout = new ObjectOutputStream(fw);
        Scanner sc =new Scanner(System.in);

        

        int y;
        String id ; 
        String title ; 
        String story ; 
        String criminal;
        String sus,info;
        String loc,locinfo;
        String evi,eviinfo;
        String sol;

        String role;
        String sinfo;
        String stmt;

       //suspect.put("Rahul","\nRole: Student\ninfo: Was active in online discussions.\nstmt: I only saw the posts, I didn't create them."); 
       do
       {

        HashMap<String,HashMap<String,String>> casef = new HashMap<>();
        HashMap<String,String> caseinfo = new HashMap<>();
        HashMap<String,String> suspect =new HashMap<>();
        HashMap<String,String>  location =new HashMap<>();
        HashMap<String,String> clue =new HashMap<>();
          
        id="";   
        System.out.print("id ");
       id=sc.nextLine();
        caseinfo.put("caseid",id);

        System.out.print("title ");
       title=sc.nextLine();
        caseinfo.put("title",title);

        System.out.print("story ");
       story=sc.nextLine();
        caseinfo.put("story",story);

        System.out.print("sol ");
       sol=sc.nextLine();
        caseinfo.put("solution",sol);

        System.out.print("criminal ");
       criminal=sc.nextLine();
        caseinfo.put("criminal",criminal);

        casef.put("caseinfo",caseinfo);
        casef.put("suspect",suspect);
        casef.put("locations",location);
        casef.put("clue",clue); 

       System.out.print("suspect name: ") ;
       sus=sc.nextLine();
       System.out.print("role: ");
       role=sc.nextLine();
       System.out.print("info: ");
       sinfo=sc.nextLine();
       System.out.print("stmt: ");
       stmt=sc.nextLine();
       info="role: "+role+"\ninfo: "+sinfo+"\nstatement:"+stmt;
       suspect.put(sus,info);

       System.out.print("suspect name: ") ;
       sus=sc.nextLine();
       System.out.print("role: ");
       role=sc.nextLine();
       System.out.print("info: ");
       sinfo=sc.nextLine();
       System.out.print("stmt: ");
       stmt=sc.nextLine();
       info="role: "+role+"\ninfo: "+sinfo+"\nstatement:"+stmt;
       suspect.put(sus,info);

       System.out.print("suspect name: ") ;
       sus=sc.nextLine();
       System.out.print("role: ");
       role=sc.nextLine();
       System.out.print("info: ");
       sinfo=sc.nextLine();
       System.out.print("stmt: ");
       stmt=sc.nextLine();
       info="role: "+role+"\ninfo: "+sinfo+"\nstatement:"+stmt;
       suspect.put(sus,info);

       System.out.print("location name: ") ;
       loc=sc.nextLine();
       System.out.print("info: ");
       locinfo=sc.nextLine();
        location.put(loc,locinfo); 
        System.out.print("location name: ") ;
       loc=sc.nextLine();
       System.out.print("info: ");
       locinfo=sc.nextLine();
        location.put(loc,locinfo);
        System.out.print("location name: ") ;
       loc=sc.nextLine();
       System.out.print("info: ");
       locinfo=sc.nextLine();
        location.put(loc,locinfo);



       System.out.print("evidence: ") ;
       evi=sc.nextLine();
       System.out.print("info: ");
       eviinfo=sc.nextLine();
        clue.put(evi,eviinfo);
        System.out.print("evidence: ") ;
       evi=sc.nextLine();
       System.out.print("info: ");
       eviinfo=sc.nextLine();
        clue.put(evi,eviinfo);
        System.out.print("evidence: ") ;
       evi=sc.nextLine();
       System.out.print("info: ");
       eviinfo=sc.nextLine();
        clue.put(evi,eviinfo);
        

        oout.writeObject(casef);
        oout.flush();

        
        System.out.print("enter 1: ");
        y=sc.nextInt();
        sc.nextLine();
        
       }while(y==1);
       oout.close();

    }
    
}
