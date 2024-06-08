package exercises.beta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerRecursion {

    // Program that calculates the power of a number by using recursion
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Type a number: ");
            int base = scanner.nextInt();
            System.out.print("Raise the number to the power: ");
            int powerExp = scanner.nextInt();

            int result = toPower(base, powerExp);
            System.out.printf("The number %d to the power %d = %d%n", base, powerExp, result);
        } catch (InputMismatchException e) {
            System.err.format("%s: wrong type of input%n", e);
        }
    }

    public static int toPower(int base, int powerExp) {
        if (powerExp != 0) {
            return toPower(base, powerExp - 1) * base;
        } else {
            return 1;
        }
    }
}
