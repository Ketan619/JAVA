// class Vechicle {
//     void run() {
//         System.out.println("run krte haii");
//     }
// }

// class Bike extends Vechicle {
//     void run() {
//         System.out.println("ye bhi chalti h");
//         super.run();
//     }
// }

// public class oop4 {
//     public static void main(String[] args) {
//         Bike obj = new Bike(); 
//         obj.run();
// //         Vechicle obj1 = new Bike();  
// // obj1.run(); 

//     }
// }
class shape{
    void darw(){
        System.out.println("darw Shape");
    }
}

class Circle extends shape{
   
    void darw(){
        super.darw();
        System.out.println("draw a circle");
        
    }
}
class Square extends shape{
    void darw(){
        System.out.println("draw a sqaure");
    }
}
public class oop4 {

    public static void main(String[] args) {
        shape obj1=new Circle();
        shape obj=new Square();
        // Square obj=new Square();
        obj1.darw();
        obj.darw();
    }
}