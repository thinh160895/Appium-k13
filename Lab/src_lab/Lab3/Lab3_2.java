public class Lab3_2 {
    public static void main(String[] args) {
        int[] intArr = {0, 5, 3, 4, 99, 22};
        int minNumber = intArr[0];
        int maxNumber = intArr[0];

        for (int i : intArr) {
            if (i <= minNumber)
                minNumber = i;

            if (i >= maxNumber)
                maxNumber = i;
        }
        System.out.println("Maximum number is:" + maxNumber);
        System.out.println("Minimum number is:" + minNumber);
    }
}