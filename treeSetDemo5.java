import java.util.Comparator;
import java.util.TreeSet;

public class treeSetDemo5 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>(new my());
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("A"));
        System.out.println(t);
    }
}

class my implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();

        // return +1;
        // return -1;
        // return 0;
        return s2.compareTo(s1);
    }
}