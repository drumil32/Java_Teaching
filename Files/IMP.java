import java.io.*;
import java.util.*;

public class IMP {
    public static void main(String args[]) throws Exception
    {
        // BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter a number");
        // int i=b.read();
        // System.out.println("Num: "+(char)i);

        File f=new File("print_str.txt");
        f.setReadOnly();
        f.setReadable(false);

        System.out.println("parent "+f.getParentFile());
        System.out.println("Absolute File : "+f.getAbsoluteFile());
        System.out.println("Absolute Path : "+f.getAbsoluteFile());
        System.out.println("Path : "+f.getPath());

        System.out.println("Hidden : "+f.isHidden());
        System.out.println("Compares to : "+f.compareTo(new File("c1.txt")));
        System.out.println("Compares to : "+new File("c2.txt").compareTo(new File("c1.txt")));
        System.out.println("Equals to : "+f.equals(new File("c1.txt")));

        File f2=new File("D:/Nisarg/JAVA/Files/DEMO");
        System.out.println(f2.mkdir());// creates one folder
        System.out.println(new File("D:/Nisarg/JAVA/Files/DEMO/NEW1/NEW2").mkdirs());//creates nested folders
        System.out.println(new File("D:/Nisarg/JAVA/Files/DEMO/NEW1/NEW2/NEW3/NEW4").mkdir());//WILL NOT WORK BUT WILL COMPILE SUCCESSFULLY

        // Scanner sc=new Scanner(f);
        // while(sc.hasNextLine())
        // {
        //     System.out.println(sc.nextLine());
        // }

        BufferedReader br=new BufferedReader(new FileReader(f));
        String st="";
        while((st=br.readLine())!=null)
        {
            System.out.println(st); // wothout ln it will not consider enter given in file.
        }
    }
    
}
