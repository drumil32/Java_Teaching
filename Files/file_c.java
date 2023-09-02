import java.io.*;
public class file_c {
    public static void main(String args[]) throws Exception
    {
        // File f = new File("hello.txt");
        // File f = new File("D:/Nisarg/JAVA/Files");
        // System.out.println(f.isDirectory());
        // String s[]=f.list();
        // for(String x:s)
        // {
        //     System.out.println(x);
        // }

        // File s[]=f.listFiles();
        // for(File x:s)
        // {
        //     // System.out.println(""+x.getName());
        //     // System.out.println("  "+x.getPath());
        //     System.out.println(""+x.getParent());

        // }


        // File f=new File("hello.txt");
        // boolean boo=f.createNewFile();


    try{
        FileWriter f=new FileWriter ("print_str.txt");
        String s= "hello";
        char b[]=s.toCharArray();
        f.write('a');// it will give error as in file demo1.java we have made print_str.txt file as readonly so here it will 
        // System.out.println(f.exists());
        // FileReader fr=new FileReader("print_str.txt");
        // char br[]=new char[100];
        // fr.read(br);
        // String ou=new String(br);
        // System.out.println(br);
    }
        catch(Exception e)
        {
            System.out.println("Exception is : "+e);
        }

    }
    
}
