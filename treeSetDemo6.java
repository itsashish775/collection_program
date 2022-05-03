import java.util.Comparator;
import java.util.TreeSet;

import javax.lang.model.util.ElementScanner6;

public class treeSetDemo6 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new myComparator());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add("AA");
        t.add(new StringBuffer("XX"));
        t.add("ABCD");
        t.add("A");
        t.add(35);
        System.out.println(t);
    }
}

class myComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 < l2)
            return -1;
        else if (l1 > l2)
            return +1;
        else {
            return s1.compareTo(s2);
            // return 0;
        }
    }
}