import java.awt.*;
import java.awt.event.*;

class counter extends Frame 
{
    Button b;
    Label l;
    TextField tf;
    int counts;
    counter()
    {
        setSize(200,200);
        setVisible(true);
        setLayout(new FlowLayout());

        counts=0;

        b=new Button("Count");
        l=new Label("Counts ");
        tf=new TextField(counts+"",10);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                counts++;
                tf.setText(counts+"");
            }
        });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

    }

    public static void main(String []args)
    {
        counter c=new counter();
    }
}