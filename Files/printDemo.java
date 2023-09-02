import java.io.*;

// public class printDemo {
//     public static void main(String args[])
//     {
//         File f=new File(args[0]);
//         PrintWriter pw=new PrintWriter(new FileOutputStream(f));
//     }
    
// }

class printDemo
{
 public static void main(String []args) throws IOException
 {
        PrintWriter q= new PrintWriter(System.out);
        q.write("PrintWriter");
        File f=new File("printDemo.txt");
        boolean boo=f.createNewFile();
        f.deleteOnExit();

        PrintWriter p=new PrintWriter(new FileOutputStream(f));
        p.print("PrintWriter__11");

        // q.flush();
        q.close();
        p.close();
        // PrintWriter p=null;
        // p=new PrintWriter(new FileOutputStream("print_str.txt"));
        // p.print("inside cmd");
        // p.write("inside file");
        // p.flush();
        // p.close();
 }
}