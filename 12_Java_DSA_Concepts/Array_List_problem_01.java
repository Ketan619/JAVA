import java.util.ArrayList;
import java.util.Collections;
//Sort an ArrayList and then remove all elements in reverse order.
public class Array_List_problem_01 {
    public static void main(String[] args) {
        // ArrayList banaya gaya jisme strings add honge
        ArrayList<String> arr = new ArrayList<>();

        // Elements add kiye
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("e");
        arr.add("d");

        // ArrayList ko sort kiya
        Collections.sort(arr);
        System.out.println("Sorted ArrayList: " + arr);

        // Elements ko reverse order mein remove kiya
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println("Removed: " + arr.remove(i));
        }

        // Final empty ArrayList
        System.out.println("ArrayList after removal: " + arr);
    }
}
