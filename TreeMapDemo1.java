import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap t = new TreeMap<>(new myComparator());
        t.put("BCS", "Ashish");
        t.put("AAA", "Alok");
        t.put("SXC", "Divyakirti");

        t.put("ZZZ", "ahilya");
        System.out.println(t);
    }
}

class myComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        return s2.compareTo(s1);
    }

}
