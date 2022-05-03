import java.util.*;

public class CollectionSortDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add("A");
        l.add("Z");

        l.add("L");
        l.add("W");
        // l.add(null); // RE: NullPointerException
        // l.add(5); RE: ClassCastExcepion
        System.out.println("Before sorting" + l);
        Collections.sort(l, new my());
        System.out.println("After Sortng" + l);

    }
}

class ny implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;

        return s2.compareTo(s1);
    }

}
