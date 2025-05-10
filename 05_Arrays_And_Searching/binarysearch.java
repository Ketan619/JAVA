public class binarysearch {
    public static void binary( ){
String str[]={"B","A","C"};
    for(int i=0;i<str.length-1;i++){
        for(int j=0; j<str.length-i-1;j++){
            if((int)str[j].charAt(0)>(int)str[j+1].charAt(0)){
                String temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
            
            
        }
        
        
    }
    
    for (int j = 0; j < str.length; j++) {
        System.out.println(str[j]);
    }  
}
public static void main(String[] args) {
       
    binary();    }
    }
    // public static int binary(int[] arr, int target) {
    //     int start = 0;
    //     int endPoint = arr.length - 1;

    //     while (start <= endPoint) {
    //         int midPoint = (start + endPoint) / 2;

    //         if (arr[midPoint] == target) {
    //             return midPoint;
    //         } else if (arr[midPoint] > target) {
    //             endPoint = midPoint - 1;
    //         } else {
    //             start = midPoint + 1;
    //         }
    //     }
    //     return -1;
    // }

    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    //     int target = 4;
    //     System.out.println(binary(arr, target));
    // }
 
