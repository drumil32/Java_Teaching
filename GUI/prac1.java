package GUI;

import java.awt.*;
import java.awt.event.*;
public class prac1 extends Frame implements ItemListener{
    Checkbox c1,c2,c3;
    int x=0,y=0,z=0;
    prac1()
    {
        setSize(300,300);
        setVisible(true);
        c1=new Checkbox("RED");
        c2=new Checkbox("GREEN");
        c3=new Checkbox("BLUE");
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        setLayout(new FlowLayout());
        add(c1);
        add(c2);
        add(c3);

    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==c1)
        x=255;
        if(e.getSource()==c2)
        y=255;
        if(e.getSource()==c3)
        z=255;
        if(c1.getState()==false)
        x=0;
        if(c2.getState()==false)
        y=0; 
       if(c3.getState()==false)
        z=0;
        setBackground(new Color(x,y,z));
        
    }
    
    public static void main(String args[])
    {
        prac1 d=new prac1();
    }
}
