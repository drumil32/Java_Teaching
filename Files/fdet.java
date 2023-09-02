import java.io.*;

public class fdet {
    public static void main(String[] args)throws Exception {
        File f=new File("c1.txt");
        System.out.println("FileName : "+f.getName());
        System.out.println("FilePath : "+f.getPath());
        System.out.println("FileAbsolute : "+f.getAbsolutePath());
        System.out.println("File : "+f.getParent());
        File f2=new File("demo1.txt"); // here absolute path and path have different meaning then html
        System.out.println("Demo file exists or not ? "+f2.exists());
        System.out.println("File length : "+f.length());
        System.out.println("is readable : "+f.canRead());
        System.out.println("is Writable: "+f.canWrite());
        System.out.println("is Excutable : "+f.canExecute());

        f.setReadable(true);
        f.setWritable(false);
        f.setExecutable(false);

        System.out.println("AFTER READABLE TRUE : \n");
        System.out.println("is readable : "+f.canRead());
        System.out.println("is Writable: "+f.canWrite());
        System.out.println("is Excutable : "+f.canExecute());

        {

            System.out.println("INSIDE BLOCK");
        File f3=new File("print_str.txt");
        // f.setReadOnly();
        System.out.println("parent "+f3.getParentFile());
        System.out.println("Absolute File : "+f3.getAbsoluteFile());
        System.out.println("Absolute Path : "+f3.getAbsoluteFile());
        System.out.println("Path : "+f3.getPath());

        System.out.println("Hidden : "+f3.isHidden());
        System.out.println("Compares to : "+f3.compareTo(new File("c1.txt")));
        System.out.println("Compares to : "+new File("c2.txt").compareTo(new File("c1.txt")));
        System.out.println("Equals to : "+f3.equals(new File("c1.txt")));

        File f4=new File("D:/Nisarg/JAVA/Files/DEMO");
        System.out.println(f4.mkdir());// creates one folder
        System.out.println(new File("D:/Nisarg/JAVA/Files/DEMO/NEW1/NEW2").mkdirs());//creates nested folders
        System.out.println(new File("D:/Nisarg/JAVA/Files/DEMO/NEW1/NEW2/NEW3/NEW4").mkdir());//WILL NOT WORK BUT WILL COMPILE SUCCESSFULLY
        }

    }
    
}
