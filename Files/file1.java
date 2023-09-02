// package Files;
import java.io.*;
import java.lang.*;


public class file1  {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos=new FileOutputStream("demo1.txt");
        
        // String s="HELLO WORLD MOVIE2";
        String s="HELLO WORLD MOVIE2";

        byte []b=s.getBytes();
        //.getBytes() gives array of bytes
        //OR
        //fos.write(s.getBytes());

        // for(byte x:b)
        // {
        //     fos.write((char)x);
        // }

        //OR
        // fos.write(b,6,10);
        //OR
        fos.write(b);
        fos.close();
         
    }


    
}
