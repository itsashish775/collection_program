import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(10, 1);
        System.out.println("**************************************************************************");
        System.out.println("capacity " + v.capacity());
        for (int i = 0; i < v.capacity(); i++) {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        v.addElement("a");
        System.out.println(v + "capacity " + v.capacity());

    }

}
