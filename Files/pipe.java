import java.io.*;

class producer extends Thread{
    int c;
    OutputStream os;
    producer(OutputStream s)
    {
        os=s;
    }
    public void run()
    {
        
        try{
            for(int i=0;i<100;i++){
            os.write(i);
            os.flush();
            System.out.println("PRO : "+i);
            System.out.flush();
            }
            Thread.sleep(10);
    
        }
        catch(Exception e)
        {}
    }
}

class consumer extends Thread
{
    int x;
    InputStream is;
    consumer(InputStream s)
    {
        is=s;
    }
    public void run()
    {
        
        try{
            for(int i=0;i<100;i++){
            x=is.read();
            // os.flush();
            System.out.println("CON : "+x);
            System.out.flush();
            }
            Thread.sleep(10);
        }
        catch(Exception e)
        {}
    }
}
public class pipe {
    public static void main(String args[]) throws Exception{
    PipedInputStream pis=new PipedInputStream();
    PipedOutputStream pos=new PipedOutputStream();
    producer p=new producer(pos);
    consumer c=new consumer(pis);
    pos.connect(pis);
    p.start();
    c.start();
    }    
}
