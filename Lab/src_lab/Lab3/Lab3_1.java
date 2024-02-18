import java.util.Arrays;

public class Lab3_1 {
    public static void main(String[] args) {
        int[] intArr = {1, 9, 7, 7, 2, 1};
        int oddCount = 0;
        int evenCount = 0;
        for (int i : intArr) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total even number:");
        System.out.println("Total odd number:");
    }
}