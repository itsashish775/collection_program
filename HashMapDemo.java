import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("Ashish", 82);
        m.put("Ashok", 95);
        m.put("Isha", 75);
        m.put("kabir", 12);
        m.put("alia", 45);
        System.out.println(m);
        System.out.println(m.put("Ashish", 77));
        System.out.println(m);
        Set s = m.keySet();
        System.out.println(s);
        Collection v = m.values();
        System.out.println(v);
        Set s1 = m.entrySet();
        System.out.println(s1);
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + "--" + m1.getValue());
            System.out.println(m1.hashCode());
            if (m1.getKey().equals("Ashish")) {
                m1.setValue(100000);
            }
        }
        System.out.println(m);

    }
}
