import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Example {
    public static void main(String[] args) {
        int[] arr = {1, 23, 43, 55, 23, 44, 55};

        // 1. HashSet: Duplicates remove karta hai, order random hota hai
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : arr) {
            hashSet.add(i);
        }
        System.out.println("HashSet (No order guaranteed): " + hashSet);

        // 2. LinkedHashSet: Duplicates remove karta hai, insertion order maintain karta hai
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i : arr) {
            linkedHashSet.add(i);
        }
        System.out.println("LinkedHashSet (Insertion order maintained): " + linkedHashSet);

        // 3. TreeSet: Duplicates remove karta hai, sorted order mein elements rakhta hai
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : arr) {
            treeSet.add(i);
        }
        System.out.println("TreeSet (Sorted order): " + treeSet);
    }
}
