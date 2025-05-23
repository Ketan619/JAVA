import java.util.ArrayList;

import java.util.Collections;

public class array_list_dynamic {
    public static void main(String[] args) {
        
        ArrayList <String> arr=new ArrayList<>();
        // arr.add("RCB");
        // arr.add("PBSK");
        // arr.add("MI");
        // arr.add(4,"GT");
        
        // arr.set(0, "KKR");
        // System.out.println(arr);
        // System.out.println(arr.get(1  ));
        // System.out.println(arr.remove(1));
        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("e");
        arr.add("d");
        
            Collections.sort(arr);
            System.out.println(arr);

            for (int i = arr.size() - 1; i >= 0; i--) {
            //    System.out.println(arr.get(i));
               System.out.println(arr.remove(i)); 
            }
            System.out.println(arr);
    }

    
}