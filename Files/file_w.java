import java.io.*;
import java.util.*;

class file_w
{
 public static void main(String[]args) throws IOException
   {
    // FileOutputStream f=new FileOutputStream("print_str.txt");
   FileReader r=new FileReader("print_str.txt");
    // Scanner sc=new Scanner(System.in);
    // String s=sc.nextLine();
    // byte b[]=s.getBytes();
      
        r.skip(20);
        // f.write(b,2,1);
        char demo[]=new char[10000];
        r.read(demo, 2, 100);
        String sdem=new String(demo);
        System.out.println(sdem);
        // f.close();
        // sc.close();
        r.close();
     
  }
}
