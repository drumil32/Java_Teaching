import java.util.HashSet;
import java.util.Set;
class demo{
    String name;
    int id;
    demo(String name, int id){
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString(){
        return name +" "+ id;
    }
}

public class SetDemo {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        // hs.size();
        // hs.iterator();
        // hs.clear();
        // hs.add(1);
        // hs.add(2);
        // hs.add(5);
        // hs.addAll(Collections obj);

        // hs.forEach(System.out::println);
        // System.out.println("DONE FOR EACH");
        // System.out.println(hs.hashCode());
        // Set h2 = new HashSet();
        // h2.add(2);
        // h2.add(2);
        // hs.add(4);
        // System.out.println(hs.equals(h2));
        // System.out.println(hs);
        System.out.println(hs.add(new String("ABC")));
        System.out.println(hs.add(new String("ABC")));
        hs.forEach(System.out::println);

        HashSet<demo> h2 = new HashSet<>();
        System.out.println(h2.add(new demo("abc",1)));
        System.out.println(h2.add(new demo("abc", 1)));
        h2.forEach(System.out::println);
    }
    
}
