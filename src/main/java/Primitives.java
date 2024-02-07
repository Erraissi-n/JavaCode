import java.io.*;
import java.util.*;

public class Primitives {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*int a = 13;
        double b = 5.5;
        a += b;
        System.out.println(a);*/
        Scanner scanner = new Scanner(System.in);
        Long input = 0L;
        int numberOfTestCases = scanner.nextInt();
        int i = 1;
        while(i <= numberOfTestCases){
            try{
                input = scanner.nextLong();
                System.out.println(input + " can be fitted in:");
                if (input >= Byte.MIN_VALUE && input <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (input >= Short.MIN_VALUE && input <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (input >= Integer.MIN_VALUE && input <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (input >= Long.MIN_VALUE && input <= Long.MAX_VALUE)
                    System.out.println("* long");
            }catch (Exception e){
                String stringInput = scanner.nextLine();
                System.out.println(stringInput + " can't be fitted anywhere.");

            }
            i++;
        }
        scanner.close();
    }
}
