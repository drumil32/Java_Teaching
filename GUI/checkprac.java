package GUI;
import java.awt.*;
import java.awt.event.*;
/*** @author nisarg*/
public class checkprac extends Frame implements ActionListener , ItemListener {

    Label l;
    Checkbox c1,c2,c3;
    // CheckboxGroup cgp; // for radion button
    public void actionPerformed(ActionEvent e)
    {

    }

    public void  itemStateChanged(ItemEvent i)
    {
        String s=" ";
        if(c1.getState())
        s+=" "+c1.getLabel();

        if(c2.getState())
        s+=", "+c2.getLabel();

        if(c3.getState())
        s+=", "+c3.getLabel();

        l.setText(s);
    }
    checkprac()
    {
        super("Checkbox Demo");
    
        setSize(400,300);
        setVisible(true);
        setBackground(Color.black);
        setForeground(Color.white);

        setLayout(new FlowLayout());
        // cgp=new CheckboxGroup();  // for radio button
        l=new Label("Please Select Something");
        //for radio button
        // c1=new Checkbox("Java",cgp,false);
        // c2=new Checkbox("Python",cgp,false);
        // c3=new Checkbox("C++",cgp,false);

        
        c1=new Checkbox("Java");
        c2=new Checkbox("Python");
        c3=new Checkbox("C++");

        add(l);
        add(c1);
        add(c2);
        add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }
    public static void main(String args[])
    {
        checkprac p=new checkprac();
    }
}
