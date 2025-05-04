class Student{
    String name="EE SALA CUP LOLLYPOPU.....!";
    void add (int a,int b){
System.out.println(a+b);
    }
}
class fullName{
    String fristname="Virat";
    String lastName="Kholi";
    void full() {
    System.out.print(fristname+lastName);
    }
}
public class oop {
    public static void main(String[] args) {
        Student obj =new Student ();
        Student obj1 =new Student ();
        System.out.println(obj1.name);
        obj.add(4, 5);
        fullName name =new fullName();
        name.full();


    }
}

