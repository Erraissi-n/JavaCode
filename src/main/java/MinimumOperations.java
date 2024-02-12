import java.util.*;

public class MinimumOperations {

    public static int minChangesForSecurePassword(String password) {
        int countOnes = 0;
        int countZeroes = 0;

        for (char c : password.toCharArray()) {
            if (c == '1') {
                countOnes++;
            } else {
                countZeroes++;
            }
        }

        // If the count of ones and zeroes is equal, no changes are needed
        if (countOnes == countZeroes) {
            return 0;
        }

        // Otherwise, return the minimum count of ones or zeroes
        return Math.min(countOnes, countZeroes);
    }

    public static void main(String[] args) {
        String password = "100110";
        int minChanges = minChangesForSecurePassword(password);
        System.out.println("Minimum number of changes required: " + minChanges);
    }
}
