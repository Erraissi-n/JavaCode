import java.io.*;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;


class ResultCoord {

    /*
     * Complete the 'isPossible' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER a
     *  2. INTEGER b
     *  3. INTEGER c
     *  4. INTEGER d
     */

    public static String isPossible(int a, int b, int c, int d) {
        // Write your code here
        if (a == c && b == d)
            return "Yes";
        else if (a > c || b > d)
            return "No";
        else {
            //return isPossible(a+b, b, c, d) == "Yes" || isPossible(a, a+b, c, d) == "Yes" ? "Yes" : "No";
            if (a == c)
                return isPossible(a, a + b, c, d);
            else
                return isPossible(a+b, b, c, d);
        }
    }

}

public class Coordination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();

        int d = scanner.nextInt();

        String result = ResultCoord.isPossible(a, b, c, d);
        System.out.println(result);

        scanner.close();
    }
}

