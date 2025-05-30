import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List_iterator_Problem_01 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Ravi");
        name.add("Anjali");
        name.add("Sonam");
        name.add("Priya");

        ListIterator<String> it = name.listIterator();

       
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }

        System.out.println("------------------");

       
        while (it.hasPrevious()) {
            String lastValue = it.previous();
            System.out.println(lastValue);
        }
    }
}
