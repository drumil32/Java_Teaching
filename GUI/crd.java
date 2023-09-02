package GUI;

import java.awt.*;
import java.awt.event.*;

public class crd  extends Frame implements ItemListener {
    CheckboxGroup c;
    Checkbox c1,c2;
    Button b1,b2,b3;;
    TextField t1,t2,t3;
    Panel mainp,p1,p2,cp;
    CardLayout cl;
    crd()
    {
        // super("CARD CLASS");
        setTitle("CARD CLASS");
        setSize(500,500);
        setVisible(true);

        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);

        b1=new Button("ONE");
        b2=new Button("TWO");
        b3=new Button("THREE");


        c=new CheckboxGroup();
        c1=new Checkbox("ONE",true,c);
        c2=new Checkbox("TWO",true,c);


        c1.addItemListener(this);
        c2.addItemListener(this);

        p1=new Panel(new FlowLayout());
        p2=new Panel(new FlowLayout());

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2.add(t1);
        p2.add(t2);
        p2.add(t3);


        cl=new CardLayout();
        mainp=new Panel();
        mainp.setLayout(cl);
        mainp.add("x1",p1);
        mainp.add("x2",p2);

        cp=new Panel();
        cp.setLayout(new FlowLayout());
        cp.add(c1);
        cp.add(c2);

        setLayout(new BorderLayout());
        add(cp,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);

        // add(p1,BorderLayout.CENTER);
        // add(p2,BorderLayout.CENTER);

    }
    public void itemStateChanged(ItemEvent e)
    {
        if(c1.getState())
        {
            cl.first(mainp);
        }
        if(c2.getState())
        {
            cl.next(mainp);
        }
        
    }

    public static void main(String args[])
    {
        crd d=new crd();
    }
    
}
