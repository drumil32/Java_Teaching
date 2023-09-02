package GUI;

import java.awt.*;
import java.awt.event.*;

public class tfd extends Frame implements TextListener,ActionListener {
    TextField t;
    Label l1,l2;

    tfd()
    {
        setSize(400,400);
        setVisible(true);
        t=new TextField(20);
        t.setEchoChar('N');
        l1=new Label("No Text Entered");
        l2=new Label("ENTER NOT PRESSED");

        t.addActionListener(this);
        t.addTextListener(this);
        setLayout(new GridLayout(3,1));
        add(l1);
        add(t);
        add(l2);
    }

    public void actionPerformed(ActionEvent e)
    {
        l2.setText(t.getText());
    }
    public void textValueChanged(TextEvent e)
    {
        l1.setText(t.getText());
    }
    
    public static void main(String args[])
    {
        tfd d=new tfd();
    }
}
