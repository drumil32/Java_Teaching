package GUI;
import java.awt.*;
import java.awt.event.*;

class mypanel extends Panel {
    String l;
    int x,y,tx,ty;
    mypanel()
    {
        x=y=0;
        tx=ty=1;
        setSize(500,250);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawString(l,x,y);
    }
}

public class banner extends Frame implements ActionListener{

    TextField tf1,tf2,tf3;
    Label l1,l2,l3;
    Choice c;
    Button b;
    int x=0,y=0,tx=1,ty=1;
    String msg;
    Font f;
    banner()
    {
        msg="demo";
        tf1=new TextField(20);
        // tf2=new TextField(20);
        // tf3=new TextField(20);

        l1=new Label("Msg");
        // l2=new Label("Size");
        // l3=new Label("Color");

        c=new Choice();
        b=new Button("Start");
        setSize(500,500);
        setVisible(true);
        b.addActionListener(this);
        setLayout(null);
        add(tf1);
        add(c);
        add(b);
        add(l1);
        // add(tf2);
        // add(tf3);
        // add(l2);
        // add(l3);

        l1.setBounds(30,50,40,20);
        tf1.setBounds(70,50,80,20);

        // l2.setBounds(30,80,50,20);
        // tf2.setBounds(70,80,80,20);

        // l3.setBounds(180,80,50,20);
        // tf3.setBounds(250,80,80,50);

        c.setBounds(170,50,80,20);
        b.setBounds(270,50,60,20);
        c.add("Right");
        c.add("Left");

        x=250;
        y=250;
        repaint();
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        
    }

    public void actionPerformed(ActionEvent e)
    {
        
        msg=new String(tf1.getText());
        // int s=Integer.parseInt(tf2.getText());

        // f.new Font("Times New Roman",s);
        // System.out.println(tf1.getText());

        if(c.getSelectedItem()=="Right" && tx<0)
        tx*=-1;
        if(c.getSelectedItem()=="Left" && tx >0)
        tx*=-1;

        Thread t= new Thread(new Thread(){
            public void run()
            {
                do
                {
                    x+=tx;
                    repaint();
                    try{
                        Thread.sleep(90);
                    }
                    catch(Exception e){}
                }while(x<450 && x>50);
            }
        });
        t.start();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,x,y);
    }
    public static void main(String args[])
    {
        banner b= new banner();
    }
    
}
