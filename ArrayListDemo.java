import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("a");
        l.add(10);
        l.add("t");
        l.add(null);
        System.out.println(l);
        l.remove("t");
        l.set(1, "p");
        l.size();
        System.out.println(l);
    }
}