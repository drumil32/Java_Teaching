package GUI;

import java.awt.*;
import java.awt.event.*;

public class ta extends Frame implements ActionListener {

    Button b;
    Label l;
    TextField tf;
    TextArea t;
    ta()
    {
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());
        b=new Button("Click");
        l=new Label("Nothing is selected");
        tf=new TextField(20);
        t=new TextArea(20,30);

        b.addActionListener(this);
        add(t);
        add(l);
        add(tf);
        add(b);

    }

    public void actionPerformed(ActionEvent e)
    {
        // t.append(tf.getText());  // when need to insert the text at the end 
        t.insert(tf.getText(),t.getCaretPosition()); // when need to insert text where cursor is pointing in textarea
        // l.setText(tf.getSelectedText());
    }

    public static void main(String args[])
    {
        ta t=new ta();
    }
}
