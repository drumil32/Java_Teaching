package GUI;
import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements Runnable{
    int x,y,tx,ty,ax,ay;
    myframe()
    {
        x=y=100;
        ax=ay=130;
        tx=ty=1;
        setSize(500,500);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        Thread t= new Thread(this);
        t.start();
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillOval(x,y,50,50);
    }
    public void run()
    {
        while(true){
            x+=tx;
            y+=ty;
            ax+=ty;
            ay+=tx;

            if(x<0 || x>450)
            tx*=-1;
            if(y<20 || x>450)
            ty*=-1;

            repaint();
            try{
                Thread.sleep(5);
            }
            catch(InterruptedException e){}
            
        }

    }
}
public class ani {

    public static void main(String args[])
    {
        myframe m=new myframe();
    }
    
}
