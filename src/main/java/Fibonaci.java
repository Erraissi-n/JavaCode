import java.util.HashMap;
import java.util.Scanner;

public class Fibonaci {

    public static Long fib(int n){
        return fib(n, new HashMap<>());
    }
    public static long fib(int n, HashMap<Integer, Long> memo){
        if(n == 0 || n == 1)
            return n;
        if(memo.containsKey(n))
            return memo.get(n);
        long result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }

}
