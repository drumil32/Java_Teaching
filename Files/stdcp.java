// package Files;
import java.io.*;


public class stdcp {

    public static void main(String[] args)  throws Exception{

        FileInputStream fis=new FileInputStream("c1.txt");

        byte b[]=new byte[fis.available()];
        fis.read(b);
        String s=new String(b);

        File f=new File("c2.txt");

        boolean boo= f.createNewFile();

        // if(f.createNewFile())
        // System.out.println("DONE");
        FileOutputStream fos = new FileOutputStream("c2.txt");
        fos.write(b);
        System.out.println("FileName : "+f.getName());
        System.out.println("Message "+s+" is copied from c1 to c2");

        fis.close();
        fos.close();
    }
    
}
