import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap t = new TreeMap<>();
        t.put(100, "Ashish");
        t.put(101, "Alok");
        t.put(102, "Akhilesh");
        t.put(45, 855);
        t.put(105, null);
        // t.put("AAA", 78); throws ClassCastException
        // t.put(null, 899); throws NullPointerException
        System.out.println(t);
    }
}
