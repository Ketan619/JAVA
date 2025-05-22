interface A {
    void show();
}

interface  b {
    // void show();
    void PrintNew  ();
}

public class Multiple_Inheritace_Interface implements  A, b {

    public  void show(){
        System.out.println("This Is common feature of A and b ");
    }

    public  void PrintNew(){
        System.out.println("Print The Data ");
    }

    public static void main(String[] args) {
        Multiple_Inheritace_Interface obj = new Multiple_Inheritace_Interface();
        obj.show();
        obj.PrintNew();


    }
}
