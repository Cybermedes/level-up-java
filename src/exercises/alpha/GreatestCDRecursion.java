package exercises.alpha;

import java.util.Scanner;

public class GreatestCDRecursion {

    //Find the Greatest Common Divisor between 2 numbers by using recursion
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int myNumA = scanner.nextInt();
        System.out.print("Type the second number: ");
        int myNumB = scanner.nextInt();
        int gcd = findGCD(myNumA, myNumB);

        System.out.printf("The GCD of %d and %d is %d", myNumA, myNumB, gcd);
        scanner.close();
    }

    //Method to find the GCD
    public static int findGCD(int numA, int numB) {
        if (numB != 0) {
            return findGCD(numB, numA % numB);
        } else {
            return numA;
        }
    }
}