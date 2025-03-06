public class NullPointerDemo {
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        text.length(); // This will throw NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException...");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("\nHandling NullPointerException...");
        handleException();
    }
}
