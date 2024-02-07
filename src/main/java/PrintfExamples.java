public class PrintfExamples {
    public static void main(String[] args) {
        // Basic formatting
        System.out.printf("Hello, %s! You are %d years old.%n", "John", 25);

        // Floating-point formatting
        System.out.printf("The value of PI is approximately %.3f%n", Math.PI);

        // Specifying width and precision
        System.out.printf("The number %d formatted with width 5: %5d%n", 42, 42);

        // Formatting integers with leading zeros
        System.out.printf("The number %d formatted with leading zeros: %05d%n", 7, 7);
    }
}

