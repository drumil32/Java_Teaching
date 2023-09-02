import java.io.FileInputStream;

public class fmv1 {
    //while running give arg as fmv1.java to read this file
    public static void main(String[] args) {
        try{
        FileInputStream fis=new FileInputStream(args[0]);
        int size=fis.available();
        // for(int i=0;i<size;i++)
        // System.out.print((char)fis.read());




        System.out.println();
        System.out.println();
        System.out.println("READING FIRST AND LAST 10 BYTES OF THIS FILE.");
        System.out.println("FIRST 10 BYTES");
        for(int i=0;i<10;i++)
        System.out.print((char)fis.read());

        System.out.println();
        System.out.println("LAST 10 BYTES");
        fis.skip(size-20);
        for(int i=0;i<10;i++)
        System.out.print((char)fis.read());



        }catch(Exception e)
        {//do not format this
            System.out.println(e);}}}