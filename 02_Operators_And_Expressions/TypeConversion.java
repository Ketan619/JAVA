// Program to demonstrate type conversion in Java (int to float and float to int)
public class TypeConversion {

    // Static method for conversion demonstration
    static void conversion() {
        // int to float conversion
        int a = 4;
        float f = a;  // Implicit conversion from int to float
        System.out.println("int to float: " + f);

        // float to int conversion (explicit casting)
        float b = 5f;
        int i = (int) b;  // Explicit casting from float to int
        System.out.println("float to int: " + i);
    }

    public static void main(String[] args) {
        // Call the conversion method to demonstrate the type conversion
        conversion();
    }
}
