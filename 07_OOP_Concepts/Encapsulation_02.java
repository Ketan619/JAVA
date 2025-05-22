
public class Encapsulation_02 {

    public static void main(String[] args) {

        Encapsulation_02 obj =  new Encapsulation_02();
        obj.setad("enter your addres ");
        System.out.println(obj.getad());

        Encapsulation_01 myObj = new Encapsulation_01();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }


    private String ad ; // private = restricted access

    // Getter
    public String getad() {
        return ad;
    }

    // Setter
    public void setad(String newAd) {
        this.ad= newAd;
    }
}
