package GUI;

import java.awt.*;
import java.awt.event.*;

public class winc extends Frame implements MouseListener {
    mcanvas c;
    winc()
    {
        c=new mcanvas();
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        add(c);
        c.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {
        c.setBackground(Color.RED);
        // TODO Auto-generated method stub
        
    }
    public void mousePressed(MouseEvent e) {
        c.setBackground(Color.PINK);

        // TODO Auto-generated method stub
        
    }
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        c.setBackground(Color.black);
        
    }
    public void mouseEntered(MouseEvent e) {
        c.setBackground(Color.green);
        // TODO Auto-generated method stub
        
    }
    public void mouseExited(MouseEvent e) {
        c.setBackground(Color.blue);
        // TODO Auto-generated method stub
        
    }
    public static void main(String args[])
    {
        winc d=new winc();
    }
}

class mcanvas extends Canvas{
    mcanvas()
    {
        setSize(300,300);
        setVisible(true);
        setBackground(Color.BLACK);
    }
}
