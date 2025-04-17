import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
System.out.println("Enter the size of array");
int n=sc.nextInt();
System.out.println("enter ar valuess");
int[]arr=new int[n];
for (int i=0;i<n;i++){
    arr[i]=sc.nextInt();

}
for (int j=0;j<arr.length;j++){
    System.out.println(arr[j]);
    sum+=arr[j];
    max=Math.mac(max.arr[j];)
}

System.out.println(sum);
System.out.println(max);
    }
}
