import java.io.*;
/*
data of print_str.java
abcdefghijklmnopqrstuvwxyz
123456789
!@#$%^&*()
a1b2c3d4e5f6g7h8i9j0k1l2m3n4o5p6q7r8s9t9u0v1w2x3y4z
 */
public class ran {
    public static void main(String args[]) throws Exception
    {
        RandomAccessFile rf=new RandomAccessFile("print_str.txt","rw");// using this we can read and write file from same object/stream and can access file from anywhere i.e. we can start writing the file from anywhere
        byte []b=new byte[500];
        rf.read(b);
        for(int i=0;i<103;i++)
        System.out.println((char)b[i]);
        System.out.println(rf.getFilePointer());//if we reach till end of file then this will return the index of last element
        
    }
    
}
