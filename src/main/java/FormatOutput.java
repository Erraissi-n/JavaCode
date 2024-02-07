import java.util.Scanner;

public class FormatOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sample Input");
        System.out.println("java 100");
        System.out.println("cpp 65");
        System.out.println("python 50");

        System.out.println("\nSample Output");
        System.out.println("================================");

        while (scanner.hasNext()) {
            String inputString = scanner.next();
            int inputInt = scanner.nextInt();

            // Format and print the output
            System.out.printf("%-15s%03d%n", inputString, inputInt);
        }

        System.out.println("================================");

        scanner.close();
    }
}
