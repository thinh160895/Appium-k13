 /* Lab 6.2:
  * String myPassword = "password123";
  * Allow user to input maximum 3 times
  */
package Lab6;

 import java.util.Scanner;

 public class Lab6_2 {
    public static void main(String[] args) {
        final String PASSWORD = "password123";
        int inputCount = 1; // Số lần nhập mặc định = 1, nếu = 0 thì  nhập được 4 lần.
        Scanner scanner = new Scanner(System.in);

        while (inputCount <= 3) {
            System.out.print("Please input your password: ");
            String userInput = scanner.nextLine();

            if (userInput.equals(PASSWORD)) {
                System.out.println("Password is correct, system boots!");
                break;
            } else {
                System.out.println("Password is invavid, please try again!");
                inputCount++; // mỗi lần nhập sai, số lần đã nhập + 1.
            }
        }

        if (inputCount > 3) {
            System.out.println("You enter the wrong password more than 3 times, your account will be temporarily locked!");
        }
    }
}
