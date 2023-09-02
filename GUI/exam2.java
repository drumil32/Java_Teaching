package GUI;
import java.awt.*;
import java.awt.event.*;

public class exam2 extends Frame implements KeyListener{
    int ch,wrd;
    TextArea ta;
    TextField tf;

    exam2()
    {
        ta=new TextArea();
        tf=new TextField();
        setSize(500,500);
        setVisible(true);

        add(tf,BorderLayout.NORTH);
        add(ta,BorderLayout.CENTER);
        ta.addKeyListener(this);
        wrd=1;
        ch=0;
    }

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==e.VK_SPACE)
        wrd++;
        ch++;
    }
    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyCode()==e.VK_ENTER)
        {
            tf.setText("Words  : "+wrd + "Characters : "+ch );
        }
    }
    public void keyTyped(KeyEvent e)
    {

    }

    public static void main(String[] args) {
        exam2 obj=new exam2();
    }
}
