import java.util.Scanner;
import java.io.*;

 public class verify 
{
    String name="Harsh";
    Scanner sc = new Scanner(System.in);
    int a;
    private int auth(int i) 
    {
      if(i==1)
      {
        return 1;
      }
      return 0;
    }

    public verify()
    {
      Console cons = System.console();
      System.out.println("\n\t\t  PASSWORD VAULT");
      System.out.println("-------------------------------------------------------------");
      char[] p = cons.readPassword("Verify itz you----> ");
      String pass=new String(p);
      System.out.println();

      if(pass.equals("1234"))
      {
        System.out.println("Hello "+name.toUpperCase());
        a=auth(1);
      }  
      else
      {
        System.out.println("Sorry! I can't recognize you...");
        a=auth(0);
      }  
    }
    public int getauth()
    {
      return a;
    }
     
}

