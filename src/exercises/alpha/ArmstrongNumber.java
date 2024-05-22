package exercises.alpha;

import java.util.Scanner;

public class ArmstrongNumber {

    /*Program that calculates the Armstrong number. It is a number that is equal
    to the sum of cube of its digits
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type one number: ");
        int numberToCheck = scanner.nextInt();
        int originalNumber, result = 0, digits = 0, tempVar;

        originalNumber = numberToCheck;
        tempVar = numberToCheck;

        while (tempVar > 0) {
            tempVar /= 10;
            digits++;
        }

        while (numberToCheck > 0) {
            int lastDigit = numberToCheck % 10;
            result += (int) Math.pow(lastDigit, digits);
            numberToCheck /= 10;
        }

        System.out.println("Number of digits " + digits);
        if (result == originalNumber) {
            System.out.println(originalNumber + " IS an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " IS NOT an Armstrong Number.");
        }
        scanner.close();
    }
}