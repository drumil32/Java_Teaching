package GUI;

import java.awt.*;
import java.awt.event.*;

public class wina extends Frame implements WindowListener {
    int x=0;
    wina()
    {
        setSize(300,300);
        setVisible(true);
        addWindowListener(this);
    }
    public void paint(Graphics g)
    {
        if(x==1)
        g.drawOval(50,50,100,100);
        else
        g.drawRect(50,50,100,200);
    }
    
    public void windowClosed(WindowEvent e)
    {

    }
    public void windowClosing(WindowEvent e)
    {
        // System.exit(0);
        dispose();
    }
    
    public void windowOpened(WindowEvent e)
    {
        repaint();
    }
    public void windowActivated(WindowEvent e)
    {
        x=1;
        repaint();
    }
    public void windowDeactivated(WindowEvent e)
    {
        x=0;
        repaint();
    }
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        
    }

    public static void main(String args[])
    {
        wina d=new wina();
    }
}
