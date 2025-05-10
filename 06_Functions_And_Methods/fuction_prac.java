// 1.	WAP to print natural numbers up-to 'n'✅
import java.util.Scanner;
public class fuction_prac {
    public  void natural(int a){
        for (int i = 1; i <=a; i++) {
           System.out.println(i);
        }
    }
    public static void main(String[] args) {
        java.util.Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your end Digit:");
        int a=sc.nextInt();
       fuction_prac obj=new fuction_prac();

       obj.natural(a);
    }
}
// import java.util.Scanner;
// public class fuction_prac {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your end Digit:");
//         int end=sc.nextInt();
// for(int i=1;i<=end;i++){
//     System.out.print(i);
// }
//     }
// }
// 🌀	WAP to print all even numbers between two given range
// import java.util.Scanner;
// public class fuction_prac {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);

//     System.out.println("Enter Your Start  number");
//     int st =sc.nextInt();
//     System.out.println("Enter Your End  number");
//     int end =sc.nextInt();
   
//     // for (int i = 0; i <=end ; i+=2) {
       
//     //    System.out.println(i);
//     // }
//     for (int i = st; i <=end ; i++) {
       
//        if (i%2==0) {
//         System.out.println("Even"+i);
//        }
//     }
// }
    
// }

// ♨️ WAP to print 'n' natural numbers in reverse order
// import java.util.Scanner;
// public class fuction_prac {

// public void reverse(int end ,int st){
   
//     for (int i = end ; i >=st; i--) {
//         System.out.println(i);
//     }
// }
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter your Starting numbers:");
//     int st=sc.nextInt();
//     System.out.println("Enter your Ending numbers:");
//     int end =sc.nextInt();
//     System.out.println("Your Reverse :");
//     fuction_prac obj=new fuction_prac();
//     obj.reverse(end, st);
// }
// }
// WAP to find sum of 'n' natural numbers
// import java.util.Scanner;
// public class fuction_prac {

    

//     public void sum(int end){
        
//         int total=0;
//     for (int i = 1; i <= end; i++) {
//         // total+=i;
//          total = end * (end + 1) / 2;
//     }
//     System.out.println("Your Sum of 'N' Natural Numbers:"+total);
   
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter Your Ending Numbers:");
//         int end= sc.nextInt();
//         sc.close();
//        fuction_prac obj=new fuction_prac();
//        obj.sum(end);
       
//     }
// }
// WAP to print reverse of a given number
// public class fuction_prac {
// public static void main(String[] args) {
//     int num =1234;
//     int rev=0;
//     for (int i=num; i!=0; i=i/10) {
//         int dg=i%10;
//         rev=rev*10+dg;
     
//     }
//     System.out.println(rev);
// }
    
// }