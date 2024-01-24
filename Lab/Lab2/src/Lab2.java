import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your Weight(kg)");
                double weight = scanner.nextFloat();
            System.out.println("Please enter your Height(m)");
                double height = scanner.nextFloat();
                double BMI = weight /(height*height);
            System.out.println("Your BMI is: " + BMI);
                if (BMI <= 18.5){
                System.out.println("you're underweight, Please improve!");
            } else if (BMI > 18.5 && BMI <= 24.9) {
                System.out.println("You're normal weight, Keep going!");
            } else if (BMI >= 25 && BMI <= 29.9)
                System.out.println("You're overweight, Please exercise!");
            else if (BMI >= 30)
                System.out.println("You're Obesity, Stop eating fast food!");

        }
    }

