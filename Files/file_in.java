// package Files;

import java.io.*;

public class file_in  {
    public static void main(String[] args) throws Exception {
        // FileInputStream fis=new FileInputStream("demo1.txt");
        // // byte b[]=new byte[fis.available()];
        // // fis.read(b);
        // // String str=new String(b);
        // // System.out.println(str);

        // //OR
        // int x;
        // do{
        //     x=fis.read();
        //     if(x>0)
        //     System.out.print((char)x);
        // }while(x!=-1);




        //USING FILE READER
        FileReader fr=new FileReader("demo1.txt");

        char c[]=new char[100];
        fr.read(c);
        String s= new String(c);
        System.out.println(s);

    }
    
}
