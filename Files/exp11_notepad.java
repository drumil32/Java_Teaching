import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class exp11_notepad extends Frame implements ActionListener {
    MenuBar m;
    Menu m1;
    MenuItem i1,i2,i3,i4;
   static  File f;
    static RandomAccessFile r;
    static TextArea ta;
   static  StringBuffer str;


    exp11_notepad()
    {
        setSize(800,500);
        setVisible(true);
        m=new MenuBar();
        m1=new Menu("File");
        i1=new MenuItem("Copy");
        i2=new MenuItem("Paste");
        i3=new MenuItem("Save");
        i4=new MenuItem("Exit");

        ta=new TextArea();
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);

        setMenuBar(m);
        m1.add(i3);
        m1.add(i1);
        m1.add(i2);
        m1.add(i4);
        m.add(m1);

        add(ta);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        StringBuffer copy=new StringBuffer();

        if(e.getSource()==i1)
        {
            copy=new StringBuffer(ta.getSelectedText());
        } 
        if(e.getSource()==i2)
        {
            ta.append(new String(copy));
        }
        if(e.getSource()==i3)
        {
            String s=ta.getText();
            try{
            r.writeUTF(s);
            }catch(Exception exep){}
        }
        if(e.getSource()==i4)
        {

            System.exit(0);
        }
    }

    static void  set()
    {
        try{

            Scanner sc=new Scanner(f);
            while(sc.hasNextLine())
            {
                str.append(sc.nextLine());
            }
            ta.append(str.toString());
            sc.close();
        }catch(Exception e)
        {}
    }

    public static void main(String []args) throws Exception
    {
        exp11_notepad obj=new exp11_notepad();
        f=new File(args[0]);
        r=new RandomAccessFile(f, "rw");
        if(!f.exists())
        f.createNewFile();
        set();
        System.out.println(""+r.length());
        // f.close();
        r.close();
    }
}
