import java.util.Scanner;
public class Lab2_2 {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input the number, let's see it odd or even number");
            float InputNumber = scanner.nextFloat();
            if (InputNumber % 2 == 0){
                System.out.println("It is even number:"+InputNumber);
            }else {
                System.out.println("It is odd number:"+InputNumber);
            }
        }
    }
