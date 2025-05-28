import java.util.ArrayList;

public class ArrayList_Dyn {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("RCB");
        arr.add("PBSK");
        arr.add("MI");
        arr.add(2, "GT");

        arr.set(0, "KKR");

        System.out.println("ArrayList: " + arr);
        System.out.println("Get index 1: " + arr.get(1));
        System.out.println("Removed element at index 1: " + arr.remove(1));
        System.out.println("Final ArrayList: " + arr);
    }
}
