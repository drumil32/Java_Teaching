package GUI;
import java.awt.*;
import java.awt.event.*;
public class pointer extends Frame {

    int x,y;

    pointer()
    {
        setSize(500,500);
        setVisible(true);
        // setOpacity(0);
        // AWTUtilities.setOpacity(0);

        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });

        // setUndecorated(true);
        // setOpacity(0.2);
        setBackground(new Color(0,0,0,0));

        setLayout(new FlowLayout());

        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
                dispose();
            }
        });
    }


    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawOval(x,y,50,50);
    }
    
    public static void main(String args[])
    {
        pointer p=new pointer();
    }
    
}
