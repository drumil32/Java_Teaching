import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class arrst {
    public static void main(String[] args) throws Exception {
        File arrSt=new File("arrSt.txt");

        if(!arrSt.exists()){
        boolean boo=arrSt.createNewFile();
        }
        ByteArrayOutputStream bos =new ByteArrayOutputStream(5);// size for how many bytes we need to write
        /* here in byteArrayOutput stream when we mention size it will create byte array internally and store values in that internally created array before writing it to file */
        bos.write('N');
        bos.write('I');
        bos.write('S');
        bos.write('A');
        bos.write('R');
        bos.write('G');//it is still writing though the array size that we mentioned has exceeded
        bos.writeTo(new FileOutputStream(arrSt));
        byte []byt=bos.toByteArray(); // it will give array of the bytes that it has written in to output stream

        ByteArrayInputStream bis=new ByteArrayInputStream(byt);
        
        String out=new String(bis.readAllBytes());
        System.out.println(out);
    }
    
}
