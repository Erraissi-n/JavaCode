import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingBinarySort {

    public static ArrayList<Integer> binarySort(ArrayList<Integer> ArrayToSort){
        Collections.sort(ArrayToSort);
        Collections.sort(ArrayToSort, (a, b) -> Integer.bitCount(a) - Integer.bitCount(b));
        return ArrayToSort;
    }
    public static void main(String[] args) {
        ArrayList<Integer> inputArray = new ArrayList<>(Arrays.asList(7, 8, 6, 5, 8));
        System.out.println("Original Array: " + inputArray);
        System.out.println("Sorted Array: " + binarySort(inputArray));
        List<Integer> arr = new ArrayList<>();
    }
}
