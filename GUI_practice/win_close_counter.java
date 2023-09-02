import java.awt.*;
import java.awt.event.*;

public class win_close_counter  extends Frame 
{
    Button b;
    Label l;
    TextField tf;
    int counts;
    win_close_counter()
    {
        setSize(200,200);
        setVisible(true);
        setLayout(new FlowLayout());

        counts=0;

        // b=new Button("Count");
        l=new Label("Counts ");
        tf=new TextField(counts+"",10);
        add(l);
        add(tf);
        // add(b);
        // b.addActionListener(new ActionListener(){
        //     public void actionPerformed(ActionEvent ae)
        //     {
        //         counts++;
        //         tf.setText(counts+"");
        //     }
        // });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                // System.exit(0);
                counts++;
                tf.setText(counts+"");
            }
            public void windowClosed(WindowEvent we)
            {
                System.exit(0);
                // counts++;
                // tf.setText(counts+"");
            }
        });

    }

    public static void main(String []args)
    {
        win_close_counter c=new win_close_counter();
    }
}
