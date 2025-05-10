// import java.util.Scanner;

// public class fuction{
//     public static int  add(int a ,int b) {
       
//         return a+b;
        
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter first value:");
//               int a= sc.nextInt();
//               System.out.println("Enter second value");
//                int b= sc.nextInt();
//                int  sum = add(a,b);
//                System.out.println("your answer is " + sum);
//     }
// }
// non static
import java.util.Scanner;

public class fuction {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = sc.nextInt();
        System.out.println("Enter second value:");
        int b = sc.nextInt();

        fuction obj = new fuction();  
        int sum = obj.sum(a, b);       
        System.out.println("Your answer is " + sum);

        
    }
}
// public class fuction {

//     public static int array(int[] arr) {
//         int target = 4;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i; 
//             }
//         }
//         return -1; 
//     }
// public static void main(String[] args) {
//     int arr[]={1,2,3,4,5,6};
   
//     System.out.println(array(arr));
//     if (array(arr)==-1) {
//         System.out.println("TARGET NOT FOUND :");
//     }
// }
// }

  