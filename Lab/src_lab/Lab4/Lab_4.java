    /*
     *   Lab_4 Requirement: Create a simple menu with 4 options:
     *   4.1 Generate an ArrayList with random numbers (not fixed numbers) those are less than 1000
     *   4.2 After that, have a menu (You can use while loop) to have below options
     *   =====MENU======
     *   1. Print all numbers
     *   2. Print maximum value
     *   3. Print minimum value
     *   4. Search number
     *   Explaination:
     *      Option 01: We print all the numbers that we have in the array list
     *      Option 02: We need to find out the maximum number from array list and print out that value
     *      Option 03: We need to find out the minimum number from array list and print out that value
     *      Option 04: We allow user to input a number to search, if that number is existing in arraylist,
     *                 we print the number and its index. Otherwise, print that number is not in the list.
     *   Suggestion: If you can, create methods to support the logic!
     */
package Lab4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Lab_4 {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumber = generateRandomNumbers(10);
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("=====MENU======");
            System.out.println("1. Print all numbers");
            System.out.println("2. Print maximum value");
            System.out.println("3. Print minimum value");
            System.out.println("4. Search number");
            System.out.println("5. Exit, thank you for using our program!");
            System.out.print("Enter your number: ");
            choice = scanner.nextInt();

            switch (choice) {
                // Print all numbers
                case 1:
                    System.out.println("All numbers: " + randomNumber);
                    break;
                // Print maximum value
                case 2:
                    System.out.println("Maximum value: " + findMaximumValue(randomNumber));
                    break;
                // Print minimum value
                case 3:
                    System.out.println("Minimum value: " + findMinimumValue(randomNumber));
                    break;
                // Find search number
                case 4:
                    System.out.print("Enter the number to search: ");
                    int searchNumber = scanner.nextInt();
                    searchNumber(randomNumber, searchNumber);
                    break;
                // Exit program
                case 5:
                    System.out.println("Exiting... Thank for using our program!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter numbers in the menu from 1 to 5.");
            }
        }
    }
    private static ArrayList<Integer> generateRandomNumbers(int count) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(1000));
        }
        return numbers;
    }

    private static int findMaximumValue(ArrayList<Integer> ramdomNumbers) {
        int maximumValue = ramdomNumbers.get(0);
        for (int number : ramdomNumbers) {
            if (number > maximumValue) {
                maximumValue = number;
            }
        }
        return maximumValue;
    }

    private static int findMinimumValue(ArrayList<Integer> ramdomNumbers) {
        int minimumValue = Integer.MAX_VALUE;
        for (int number : ramdomNumbers) {
            if (number < minimumValue) {
                minimumValue = number;
            }
        }
        return minimumValue;
    }

    private static void searchNumber(ArrayList<Integer> randomNumbers, int searchNumber) {
        int index = randomNumbers.indexOf(searchNumber);
        if (index != -1) {
            System.out.println("The number " + searchNumber + " is at index " + index);
        } else {
            System.out.println("The number " + searchNumber + " is not in the list");
        }
    }
}