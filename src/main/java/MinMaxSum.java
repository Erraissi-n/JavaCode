import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
       /* long minSum = Integer.MAX_VALUE;
        long maxSum = Integer.MIN_VALUE;
        int size = arr.size();
        long[] sum = new long[size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(i != j)
                    sum[i] += arr.get(j);
            }
        }
        for(int k = 0; k < size; k++){
            if(minSum > sum[k])
                minSum = sum[k];
            if(maxSum < sum[k])
                maxSum = sum[k];
        }
        System.out.println(minSum + " " + maxSum);*/
        long minSum = 0;
        long maxSum = 0;
        int size = arr.size();
        //int[] sum = new int[size];
        Collections.sort(arr);
        for(int i = 0; i < size; i++){
            if(i != 0)
                maxSum += arr.get(i);
            if(i != size - 1)
                minSum += arr.get(i);
        }

        System.out.println(minSum + " " + maxSum);

    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ResultSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}
