import java.util.Arrays;

public class AscendingBinarySorting {
    public static void main(String[] args) {
        int[] inputArray = {7, 8, 6, 5, 8};
        Integer[] sortedArray = sortByBinaryOnes(inputArray);

        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    public static Integer[] sortByBinaryOnes(int[] arr) {
        Arrays.sort(arr);
        Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        //Arrays.sort(arr, (a, b) -> Integer.bitCount(a) - Integer.bitCount(b));
        Arrays.sort(integerArr, (a, b) -> Integer.bitCount(a) - Integer.bitCount(b));

        return integerArr;
    }
}
