import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(75);
        l.add(95);
        l.add(4);
        l.add(25);
        int sum = 0;
        // for (Integer i = 0; i < l.size(); i++) {

        // sum = sum + l.get(i);

        // }
        for (Integer integer : l) {
            sum += integer;
        }
        // Vector c = new Vector<>(l);
        // TreeSet t = new TreeSet<>(l);
        System.out.println(sum);
    }
}
