import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        System.out.println("Enter array values");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; // Pehle element ko max maan ke chalu karte hain

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
            sum += arr[j];
            if (arr[j] > max) {
                max = arr[j]; // Update max if current element is greater
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
    }
}
