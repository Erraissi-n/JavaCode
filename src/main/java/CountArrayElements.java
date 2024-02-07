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

class ResultArrayElements {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float countPositives = 0;
        float countNegatives = 0;
        float countZeros = 0;
        int arrSize = arr.size();
        for(int element : arr){
            if(element < 0) {
                countNegatives = countNegatives + ((float)(1/arrSize));
            }else if (element == 0) {
                countZeros += (float) (1.0/arrSize);
            }else{
                    countPositives += (float) (1.0/arrSize);
            }
        }
        System.out.println(arrSize);
        System.out.println(countPositives);
        System.out.printf("%.6f%n",countPositives);
        System.out.println(countNegatives);
        System.out.printf("%.6f%n",countNegatives);
        System.out.println(countZeros);
        System.out.printf("%.6f%n",countZeros);

    }

}

public class CountArrayElements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ResultArrayElements.plusMinus(arr);

        bufferedReader.close();
    }
}

