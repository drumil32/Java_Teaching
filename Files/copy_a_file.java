import java.io.File;
import java.io.RandomAccessFile;
import java.util.Random;

public class copy_a_file {
    public static void main(String[] args) {

        try{
        File To_be_copied=new File("to_be_copied.txt");
        RandomAccessFile raf=new RandomAccessFile(To_be_copied, "rw");       
        char []ch=new char[(int)To_be_copied.length()]; // type conversion to in as f.legth returns long int

        if(!To_be_copied.exists()){
        boolean boo=To_be_copied.createNewFile();
        raf.write("THIS IS A COPY".getBytes());
        }

        File copied_to=new File("copied_to.txt");
        if(!copied_to.exists())
        {
            boolean boo=copied_to.createNewFile();
        }

        RandomAccessFile raf2=new RandomAccessFile(copied_to, "rw");
        byte []byt=new byte[(int)To_be_copied.length()];
        raf.readFully(byt);
        raf2.writeChars(new String(byt));
    }
    catch(Exception e)        
    {}
    }
}