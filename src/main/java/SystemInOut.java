import java.io.*;
import java.util.*;

public class SystemInOut {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner scanner = new Scanner(System.in);
            int integerNumber = scanner.nextInt();
            double doubleNumber = scanner.nextDouble();
            scanner.nextLine();
            String enteredString = scanner.nextLine();
            System.out.println("String: " + enteredString);
            System.out.println("Double: " + doubleNumber);
            System.out.println("Int: " + integerNumber);
        }
}
