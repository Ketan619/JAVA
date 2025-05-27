public class class2EH {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[6]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds! The element you're trying to access does not exist in the array.");
            System.out.println("Exception: " + e);
        }
        
        System.out.println("Exception Handling....|| 21-05-25 ||");
    }
}
