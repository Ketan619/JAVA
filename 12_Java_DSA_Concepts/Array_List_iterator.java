import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_iterator {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("Virat");
        name.add("Rohit");
        name.add("Shreyas");
        name.add("Shubhman");
        name.add("Thala");
Iterator<String> it=name.iterator();
while (it.hasNext()) { 
    String elem=it.next();
    System.out.println(elem);
    if (elem.startsWith("T")){
        it.remove();
    }
}
System.out.println(name);
    }
}
//Remove form List = Thala//////