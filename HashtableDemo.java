import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        // Hashtable h = new Hashtable<>();
        Hashtable h = new Hashtable<>(25);
        h.put(new temp(5), "A");
        h.put(new temp(2), "B");
        h.put(new temp(6), "C");
        h.put(new temp(15), "D");
        h.put(new temp(23), "E");
        h.put(new temp(16), "F");
        // h.put("Durga", null); throws NullPointerException
        System.out.println(h);

    }
}

class temp {
    int i;

    temp(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
        // return i % 9;
    }

    @Override
    public String toString() {
        return i + " ";
    }
}
