import java.util.LinkedList;
import java.util.Iterator;

public class Linked_List {
    public static void main(String[] args) {
        // 1. LinkedList banaya (String type elements ke liye)
        LinkedList<String> list = new LinkedList<>();

        // 2. Elements add karna (addLast/add)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial LinkedList: " + list);

        // 3. Specific position par add karna (add(index, element))
        list.add(1, "Dates");
        System.out.println("After adding 'Dates' at index 1: " + list);

        // 4. First and Last elements add karna
        list.addFirst("Mango");
        list.addLast("Orange");
        System.out.println("After adding first and last: " + list);

        // 5. Access elements
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // 6. Modify element (set)
        list.set(2, "Blueberry");
        System.out.println("After setting index 2 to 'Blueberry': " + list);

        // 7. Remove elements
        list.remove();          // removes first element
        list.remove(3);         // removes element at index 3
        list.remove("Orange");  // removes by value
        System.out.println("After removals: " + list);

        // 8. Check size
        System.out.println("Size of LinkedList: " + list.size());

        // 9. Check if list contains an element
        System.out.println("Contains 'Cherry'? " + list.contains("Cherry"));
        System.out.println("Contains 'Orange'? " + list.contains("Orange"));

        // 10. Iterate using for-each loop
        System.out.println("Iterating using for-each:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 11. Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 12. Clear the list
        list.clear();
        System.out.println("After clearing, is empty? " + list.isEmpty());
    }
}
