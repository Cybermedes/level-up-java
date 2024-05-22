package exercises.alpha;

import java.util.Scanner;

public class AddNumbersRecursion {

    //Calculate the sum of natural numbers using recursion
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Sum all the natural numbers up to: ");
        int numLimit = reader.nextInt();
        if (numLimit < 0) {
            System.out.print("numbers cannot be negative");
            System.exit(0);
        }
        int sum = makeSum(numLimit);

        System.out.printf("The sum of all numbers up to %d = %d", numLimit, sum);

        reader.close();
    }

    //Method to make the addition
    private static int makeSum(int numMax) {
        if (numMax != 0) {
            return numMax + makeSum(numMax - 1);
        }
        return numMax;
    }
}