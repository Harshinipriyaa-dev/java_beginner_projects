import java.io.*;
import java.util.Scanner;

public class func 
{
    class MyObjectOutputStream extends ObjectOutputStream
{
    MyObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }
    protected void writeStreamHeader() throws IOException
    {
        reset();
    }
}
    
    Scanner sc = new Scanner(System.in);
    public ObjectInputStream oin ;
    public ObjectOutputStream oout;

    public func() throws IOException
{
    File file = new File("pwd.txt");

    if(!file.exists() || file.length()==0)
    {
        oout = new ObjectOutputStream(new FileOutputStream(file));
    }
    else
    {
        oout = new MyObjectOutputStream(new FileOutputStream(file,true));
    }

    if(file.exists() && file.length()>0)
    {
        oin = new ObjectInputStream(new FileInputStream(file));
    }
}
    public void add() throws IOException
    {
        detail d=new detail();
        System.out.print("Enter  website name / username: ");
        d.about=sc.nextLine();
        System.out.print("Enter password: ");
        d.pwd=sc.nextLine();
        oout.writeObject(d);
        oout.flush();
    }
    public void search()
    {
        String name;
        detail d=new detail();
        System.out.print("Enter website name / username: ");
        name=sc.nextLine();
        System.out.println();
        while(true)
        {
            try
            {
                d=(detail) oin.readObject();
                if (d.about.equals(name))
                {
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                    System.out.println("\t"+d.about+"\t"+d.pwd);
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                    break;
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
                break;
            }
        }
    }
 }  

