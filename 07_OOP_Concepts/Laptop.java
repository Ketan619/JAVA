public class Laptop {
    // Attributes
    String brand;
    int ram;         // in GB
    double price;    // in currency (e.g., INR/USD)

    // Constructor
    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    // Method to display laptop details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: ₹" + price);
    }

    // Main method to test
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", 16, 59999.99);
        myLaptop.displayDetails();
    }
}
