package GUI;

import java.awt.*;
import java.awt.event.*;

// import org.w3c.dom.events.MouseEvent;

public class prac extends Frame implements ActionListener , MouseListener {

    int count=0;
    Button b;
    Label l;
    int x=0,y=0;
    public void mousePressed(MouseEvent m){ }
    public void mouseClicked(MouseEvent m){
        x=m.getX();
        y=m.getY();
        repaint();
    }
    public void mouseReleased(MouseEvent m){ }
    public void mouseEntered(MouseEvent m){ }
    public void mouseExited(MouseEvent m){ }

    public void actionPerformed(ActionEvent e)
    {
        count++;
        l.setText(" "+count);
    }

    public void paint(Graphics g)
    {
        int i=10;
        g.drawOval(50,50,200,200);

        // while(i<50)
        // {
        // g.drawOval(50+2*i,50+2*i,200-i*3,200-i*3);
        // i+=10;
        // }
        g.drawRect(50,50,200,200);
        g.drawRect(x,y,10,10);
        g.drawString(" "+x,x+15,y+5);
        g.drawString(" "+y,x+30,y+20);
        g.drawLine(80,80,220,220);
        g.drawLine(80,220,220,80);
        g.drawLine(150,50,150,250);
        g.drawLine(50,150,250,150);


        // g.drawLine(20,20,280,280);


    }
    prac()
    {
        setSize(300,300);
        setVisible(true);
        setBackground(Color.black);
        setForeground(Color.white);
        addMouseListener(this);
        // b=new Button("CLICK");
        // l=new Label("   "+count);
        // setLayout(new FlowLayout());
        // b.addActionListener(this);
        // add(l);
        // add(b);

    }

    public static void main(String args[])
    {
        prac p=new prac();
        p.repaint();
    }
}
