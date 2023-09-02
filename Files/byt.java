import java.io.*;
public class byt {
    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos=new ByteArrayOutputStream(4);
        // 20 means how many bytes we are going to read
        bos.write('a');
        bos.write('a');
        bos.write('a');
        bos.write('a');
        bos.write('a');
        byte[]b=bos.toByteArray();// after performing this operation the content stays as it is in the inbuilt array.
        String s=new String(b);
        System.out.println(s);
        File f=new File("demo.txt");
        f.createNewFile();
        bos.writeTo(new FileOutputStream(f));
    }
    
}
