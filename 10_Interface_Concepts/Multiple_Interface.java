//bill
interface Client1{    
    void show();
}
interface Client2{
    void print();
    void show();
}
public class Multiple_Interface implements Client1,Client2{
    @Override
    public void show() {
        System.out.println("Show the Menu");
    }
    @Override
    public void print() {
        System.out.println("Print the Bill");
    }
    public static void main(String[] args) {
        Multiple_Interface obj = new Multiple_Interface();
        obj.show();
        obj.print();
    }
}
