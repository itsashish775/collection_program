import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();
        // t.add("A");
        // t.add("e");
        // t.add("R");
        // t.add("E");
        // t.add("Z");
        // t.add(new Integer(10));
        // t.add(null);
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("L"));
        System.out.println(t);
    }
}
