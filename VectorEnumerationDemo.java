import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Integer I = (Integer) e.nextElement();
            if (I % 2 == 0) {
                System.out.println(I);
                // System.out.println(v);
            } else {
                // System.out.println(I + " will be removed");
                v.remove(I);
                // System.out.println(v);
            }
        }
        System.out.println(v);
    }
}
