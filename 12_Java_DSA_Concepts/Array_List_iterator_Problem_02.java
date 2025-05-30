import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List_iterator_Problem_02 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Rohit");
        name.add("Virat");
        name.add("Shreyas");
        name.add("Shubman");

        ListIterator<String> it = name.listIterator();

        while (it.hasNext()) {
            String ele = it.next();
            if (ele.length() <= 4) {
                it.set("byeee");
            }
        }

        System.out.println(name + " ");
        System.out.println("------------------------");

        int count = 0;
        while (it.hasPrevious()) {
            String Last = it.previous();
            count++;
            if (count != name.size()) {
                it.set("hello");
            }
        }

        System.out.println(name + " ");
    }
}
