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

class ResultTime {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here  //10:12:45PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String PmAm = s.substring(8);
        String time = "";
        if(PmAm.equals("PM")){
            if(hour != 12 ){
                hour += 12;
            }
            time = Integer.toString(hour) + s.substring(2,8);
        }
        else if(PmAm.equals("AM") && hour == 12)
            time = "00" + s.substring(2,8);
        else
            time = s.substring(0,8);
        return time;
    }

}

public class TimePmAm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String result = ResultTime.timeConversion(s);
        System.out.println(result);
        scanner.close();
    }
}

