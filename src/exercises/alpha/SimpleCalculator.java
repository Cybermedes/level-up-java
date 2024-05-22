package exercises.alpha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

    private static double d1, d2, result;

    //Program that makes 4 simple mathematical operations
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a numeric value 1: ");
            d1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter a numeric value 2: ");
            d2 = scanner.nextDouble();
            scanner.nextLine();

        } catch (InputMismatchException e) {
            System.out.println("Please type a number.");
            scanner.close();
        }

        System.out.println("Select the math operation that you want (+ - * /): ");
        String operation = scanner.nextLine();
        switch (operation) {
            case "+" -> result = d1 + d2;
            case "-" -> result = d1 - d2;
            case "*" -> result = d1 * d2;
            case "/" -> result = d1 / d2;
            default -> {
                System.out.println("You didn't choose a valid operator.");
                scanner.close();
            }
        }
        System.out.println("Your result is: " + result);
        scanner.close();
    }
}