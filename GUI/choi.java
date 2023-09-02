package GUI;
//problem in following code not getting desired functioality
import java.awt.*;
import java.awt.event.*;

public class choi  extends Frame implements ActionListener , ItemListener{

    List l;
    Choice c;
    TextArea ta;
    choi()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        l=new List(3,true);
        c=new Choice();
        ta=new TextArea(10,10);
        c.addItemListener(this);
        l.addItemListener(this);

        
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thrusday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");
        c.add("July");
        c.add("August");
        c.add("September");
        c.add("October");
        c.add("November");
        c.add("December");

        add(l);
        add(c);
        add(ta);
    }
    public void actionPerformed(ActionEvent e){

        String list[]=l.getSelectedItems();
        String txt="";
        for(String x:list)
        {
            txt+=x+"\n";
        }
        ta.setText(txt);

    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == l)
        {
            String list[]=l.getSelectedItems();
            String txt="";
            for(String x:list)
            {
                txt+=x+"\n";
            }
            ta.setText(txt);
        }
        else
        ta.setText(c.getSelectedItem());
    }

    public static void main(String args[])
    {
        choi x= new choi();
    }
    
}
