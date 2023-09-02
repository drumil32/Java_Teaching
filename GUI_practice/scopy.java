import java.awt.*;
import java.awt.event.*;
import java.io.*;
//DATE:23/11/22
//SEM-3
// here i tried to copy a song .
// first opened a song in notepad so it would give UTF characters
//then i copied those utf characters and pasted it to the textarea
//and then using randomaccessfile, writeUTF method i wrote those characters into a new file
//called copied_song
//it is creating mp3 file but unable to play it.
// i think it is because those UTF characters were not encoded in form of audio. 
//CORRECTION : the file is created it mp3 file and when we try to write string it would not let it write
// so copied_song.mp3 is EMPTY file.

public class scopy extends Frame implements ActionListener{
    TextArea ta;
    Button b;
    RandomAccessFile rf;

    scopy()
    {
        super("Song Copy");
        setSize(500,400);
        setVisible(true);
        // setLayout(new FlowLayout());

        ta=new TextArea(20,20);

        b=new Button("Enter");
        b.addActionListener(this);

        add(ta);
        add(b,BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s;
        try{
        File f=new File("copied_song.mp3");
        if(!f.exists())
          f.createNewFile();

          rf=new RandomAccessFile(f,"w");
          s=ta.getText();
          rf.writeUTF(s);
        }catch(Exception e)
        {

        }
    }

    public static void main(String []args)
    {
        new scopy();
    }
}
