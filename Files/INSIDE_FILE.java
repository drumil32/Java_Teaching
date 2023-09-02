import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class INSIDE_FILE {
    public static void main(String[] args) throws Exception{
        File f=new File("insideFile.txt");
        FileReader fr=new FileReader(f);

        char []ch=new char[(int)f.length()];
        fr.read(ch,5,(int)f.length()-5);
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        System.out.println(ch[3]);
        System.out.println(ch[4]);
        System.out.println(ch[5]);

        System.out.println("USING FILE READER");
        String s=new String(ch);
        System.out.println(s);

        BufferedReader br=new BufferedReader(fr); // here it will not read anything as in filereader file pointer is at end of file as it has read whole file. :)
        String s1;
        System.out.println("USING BUFFERED READER");
        while((s1=br.readLine())!=null)
        System.out.println(s1);
        

        System.out.println();
        System.out.println();
        System.out.println("DEMO of flush");
        String write=new String("THIS IS DEMO OF FLUSH WHICH IS ABVAILABLE IN BUFFERED WRITER STEAM");

        FileWriter fw=new FileWriter(f,true); // true for appending
        BufferedWriter bw=new BufferedWriter(fw);
        // bw.flush();
        bw.write(write, 0, 10);// NOT WORKING

        fr.close();
        br.close();
    }
    
}
