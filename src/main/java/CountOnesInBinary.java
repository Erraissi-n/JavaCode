public class CountOnesInBinary {
    public static void main(String[] args) {
        int number = 3; // Change this to your desired integer
        int count = Integer.bitCount(number);
        System.out.println("Number of ones in binary representation: " + count);
    }

    public static int countOnes(int num) {
        int count = 0;

        while (num > 0) {
            // Check the rightmost bit
            if ((num & 1) == 1) {
                count++;
            }
            // Shift right to move to the next bit
            num = num >> 1;
        }

        return count;
    }
}
