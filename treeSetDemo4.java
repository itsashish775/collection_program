import java.util.Comparator;
import java.util.TreeSet;

public class treeSetDemo4 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>(new my());
        t.add("Roja");
        t.add("ShobhaRani");
        t.add("Rajkumari");
        t.add("GangaBhawani");
        t.add("Ramulamma");
        System.out.println(t);
    }
}

class my implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2;

        return -s1.compareTo(s2);
    }
}
