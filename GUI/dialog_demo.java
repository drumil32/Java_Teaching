package GUI;
import java.awt.*;
import java.awt.event.*;


public class dialog_demo extends Frame  {
    myDialog d;
    String name="Nisarg";
    String pwd="naruto@uzumaki";
    Button b;
    dialog_demo()
    {
        super("DialogBox Demo");
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        b=new Button("PRESS");
        add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                repaint();
            }
        });


        d=new myDialog(this,"LOGIN",false);

    }

    public void paint(Graphics g)
    {
        g.setColor(Color.cyan);
        g.fillRect(300, 300, 100, 100);
    }
    boolean login(String dn,String dp)
    {
        if(name.equals(dn) && pwd.equals(dp))
        return true;
        return false;
    }
    
    class myDialog extends Dialog implements ActionListener
    {
        dialog_demo d;
        TextField name,pwd;
        Button b;
        Label lname,lpdw;
        Panel p;
        myDialog(dialog_demo dd,String dname,boolean state)
        {
            super(dd,dname,state);
            d=dd;
            setSize(300,200);
            setVisible(true);

            p=new Panel();
            p.setLayout(new GridLayout(2,2));
            
            lname=new Label("Name");
            lpdw=new Label("Password");

            name=new TextField(10);
            pwd=new TextField(10);
            pwd.setEchoChar('*');

            b=new Button("OK");
            b.addActionListener(this);

            p.add(lname);
            p.add(name);
            p.add(lpdw);
            p.add(pwd);
            add("Center",p);
            add("South",b);
        }

        public void actionPerformed(ActionEvent ae)
        {
            if( d.login(name.getText(),pwd.getText()) )
            this.dispose();
        }
    }

    public static void main(String []args)
    {
        new dialog_demo();
    }
}
