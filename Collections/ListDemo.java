import java.util.List;
import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        List l2 = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);

        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);

        System.out.println(l.size());
        System.out.println(l.get(0));
        System.out.println(l.remove(0));
        
        System.out.println(l.iterator()); //Returns an iterator over the elements in this list in proper sequence.
        
        System.out.println(l);
        System.out.println(l.contains(1));
        System.out.println(l.containsAll(l2));
        l.add(10, l2);
        System.out.println(l);
        l.clear();
    }
    
}
