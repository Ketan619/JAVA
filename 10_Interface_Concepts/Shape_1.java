


// interface  shape {
//     void area ();
// }

// class  circle implements shape {
//     public void area (){
//         double r =  5.0 ;
//         double AreaCircle =  2 * 3.14 *  r  ;

//         System.out.println(" Area Of A Circle Is :"+ AreaCircle);
//     }
// }

// public class InterFaceCircle {
//     public static void main(String[] args) {

//         circle obj = new circle();
//         obj.area();
//     }
// }


public interface Shape_1 {
   void areaOfCircle();
}
class circle_1 implements Shape_1{
    int radius=5;

   @Override
   public void areaOfCircle() {
      Double result = Math.PI*radius*radius;
      System.out.println("Area of Circle : "+result);
   }
}
class main_3{
   public static void main(String[] args) {
      circle_1 obj = new circle_1();
      obj.areaOfCircle();
   }
}