public class str_null {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            System.out.println("Exception occurred:");
            System.out.println(e);
            System.out.println("Your string value is null.");
        }

        System.out.println("Program continues...");
    }
}
