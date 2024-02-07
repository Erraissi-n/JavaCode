import java.io.*;
import java.util.*;

public class LoopsUse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int queriesNumber = scanner.nextInt();
        while(queriesNumber > 0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = a;
            for(int i = 0; i < n; i++){
                //result = (int) (Math.pow(2, i)*b + result);
                result +=  Math.pow(2, i)*b;
                System.out.print(result +" ");
            }
            System.out.println("");
            queriesNumber--;
        }
    }
}
