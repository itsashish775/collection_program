import java.util.Comparator;
import java.util.TreeSet;

public class treeSetDemo3 {
    public static void main(String[] args) {
        my m = new my();
        TreeSet t = new TreeSet(m);
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }
}

class my implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        if (i1 < i2)
            return +1;
        else if (i1 > i2)
            return -1;
        else {
            return 0;
        }
    }

}
