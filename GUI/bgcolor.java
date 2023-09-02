package GUI;

import java.awt.*;
import java.awt.event.*;

public class bgcolor extends Frame implements ActionListener{

    Button b1=new Button("RED"),b2;
    Label l;
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.equals("RED"))
        setBackground(Color.RED);

        if(s.equals("BLUE"))
        setBackground(Color.BLUE);

    }
    bgcolor(){
        setTitle("Background Color Changer");
        setSize(300,300);
        // b1=new Button("RED");
        b2=new Button("BLUE");
        l=new Label("   ");
        // setLayout(new BorderLayout());
        setLayout(new FlowLayout());
        add(b1);
        b1.setBackground(Color.red);
        b1.setForeground(Color.white);

        // add(b1,BorderLayout.NORTH);
        // add(l);
        add(b2);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.white);
        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
    }

    public void paint(Graphics g)
    {
        // // g.drawString("HELLO",200,200);
        // g.setColor(Color.blue);
        // g.fillRect(20,20,100,100);
        // g.setColor(Color.red);

        // g.fillRect(70,70,100,100);
    }

    public static void main(String args[])
    {
        bgcolor b=new bgcolor();
        // b.repaint();
    }
    
}
