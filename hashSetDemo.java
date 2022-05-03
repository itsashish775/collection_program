import java.util.*;

public class hashSetDemo {
    public static void main(String[] args) {
        // LinkedHashSet h = new LinkedHashSet();
        HashSet h = new HashSet();
        h.add("A");
        h.add("B");
        h.add(null);
        h.add("C");
        h.add(4);
        h.add("D");

        h.add(45);

        System.out.println(h);
        System.out.println(h.add("B"));
    }
}
