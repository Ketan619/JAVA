// class Student {
//     String firstName="rahul";
//     int age=15;
// // paramartized //
// Student (String firstName ,int age){
//     this.firstName=firstName;
//    this. age=age;
//     System.out.println(firstName+""+age);
// }
 
// //default//
// Student (){
    
//     System.out.println(firstName+""+age);
// }

// }


class Student {
    String FirstName="rahul";
    int age= 11;

Student(){
    System.out.println("hello");

}
Student(String FirstName){
    this();
    System.out.println(FirstName);
}
Student (String FirstName ,int age){
    this(FirstName);
    this.FirstName=FirstName;
    this. age=age;
    System.out.println(FirstName+""+age);
}
}
// class oop2{
//     public static void main(String[] args) {
//         Student obj =new Student("rohit", 50);
//         Student obj1=new Student("virat", 35);
//         Student obj2 =new Student();
//         System.out.println(obj.age);
//         // System.out.println(obj1.firstName);
//     }
// }
public class oop2 {

    public static void main(String[] args) {
        Student s1 =new Student("CHAHAl",15);
        
    }
}