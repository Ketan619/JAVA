import java.util.ArrayList;
import java.util.Collections;
public class collection {
    




    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("e");
        arr.add("d");

        Collections.sort(arr);
        System.out.println("Sorted ArrayList: " + arr);

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println("Removed: " + arr.remove(i));
        }

        System.out.println("ArrayList after removal: " + arr);
    }
}
