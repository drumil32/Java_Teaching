import java.io.*;
import java.net.InetAddress;

public class exam1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis=new FileInputStream("arrSt.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        int t,c=3;
        while((t=isr.read())!=-1)
        c++;
        System.out.println(c);

        InetAddress []IP=InetAddress.getAllByName("localhost");

        for(int i=0;i<IP.length;i++)
        System.out.println("IP : "+IP[i]);
    }
    
}
