package GUI;
import java.awt.*;
import java.awt.event.*;

public class coord extends Frame{

    int x,y;
    coord()
    {
        setSize(500,500);
        setVisible(true);
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me)
            {
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawRect(x+5,y+5,10,10);
    }
    public static void main(String []args)
    {
        coord d=new coord();
    }
}