package exercises.beta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OctalToDecimal {

    // Program to convert decimal to octal and vice-versa
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("""
                    What conversion do you want to do?
                    (1) from octal to decimal;
                    (2) from decimal to octal;""");
            int choice = reader.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Type the octal: ");
                    int numOct = reader.nextInt();
                    int resultD = convertToDecimal(numOct);
                    System.out.printf(">> %d to decimal is: %d%n", numOct, resultD);
                }
                case 2 -> {
                    System.out.println("Type the decimal:");
                    int numDec = reader.nextInt();
                    if (numDec <= 7) {
                        System.out.printf(">> %d to octal is: %d%n", numDec, numDec);
                    } else {
                        int resultO = convertToOctal(numDec);
                        System.out.printf(">> %d to octal is: %d%n", numDec, resultO);
                    }
                }
                default -> System.out.println("You need to type 1 or 2!");
            }
        } catch (InputMismatchException e) {
            System.err.format("%s: wrong type of input%n", e);
        }
    }

    public static int convertToDecimal(int numOct) {
        int dec = 0, i = 0;
        while (numOct != 0) {
            dec += (int) ((numOct % 10) * Math.pow(8, i));
            i++;
            numOct = numOct / 10;
        }
        return dec;
    }

    public static int convertToOctal(int numDec) {
        int octal = 0, i = 1;
        while (numDec != 0) {
            octal = octal + (numDec % 8) * i;
            numDec = numDec / 8;
            i *= 10;
        }
        return octal;
    }
}
