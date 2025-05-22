interface Single_Interface {
    void print();
    void show();
}
class Dev implements Single_Interface{
    @Override
    public void print() {
        System.out.println("Print the Bill");
    }

    @Override
    public void show() {
        System.out.println("Show the Menu");
    }
}
class main{
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.print();
        obj.show();
    }
}
