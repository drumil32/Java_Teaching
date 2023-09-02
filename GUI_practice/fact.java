import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class fact extends Frame {
    Button next,prev;
    Label nlabel,fact_label,ans,tf;
    // TextField tf;
    ArrayList<Integer> a;
    int n;

    fact()
    {
        super("Factorial");
        setSize(500,200);
        setVisible(true);
        setLayout(new FlowLayout());
        n=1;

        next=new Button("Next");
        prev=new Button("Previous");

        nlabel=new Label("Input");
        fact_label=new Label("Output");
        ans=new Label("1");
        tf=new Label(n+"    ");

        // tf=new TextField("1",10);

        add(prev);
        add(nlabel);
        add(tf);
        add(fact_label);
        add(ans);
        add(next);

        next.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                n++;
                tf.setText(n+"  ");
                ans.setText(find_fact(n)+" ");
            }
        });
        prev.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                n--;
                tf.setText(n+"  ");
                ans.setText(find_fact(n)+"");
            }
        });
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    static int find_fact(int x)
    {
        if(x<0)
        return 0;
        if(x==0 || x==1)
        return 1;
        else
        return x*find_fact(x-1);
    }

    public static void main(String []args)
    {
        // ArrayList<Integer> ab=new ArrayList<Integer>();
        // ab.add(1);
        // if(ab.contains(2))
        // System.out.println("Yes");
        // else
        // System.out.println("NO");
        fact obj=new fact();
    }

    
}
