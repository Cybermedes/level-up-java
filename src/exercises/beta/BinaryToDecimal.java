package exercises.beta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryToDecimal {

    // Program that converts decimal to binary and vice-versa.
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("""
                    What conversion do you want to do?
                    (1) from binary to decimal;
                    (2) from decimal to binary;""");
            int choice = reader.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Type the binary:");
                    int numBin = reader.nextInt();
                    int resultB = convertToDecimal(numBin);
                    System.out.printf(">> %d to decimal is: %d%n", numBin, resultB);
                }
                case 2 -> {
                    System.out.println("Type the decimal:");
                    int numDec = reader.nextInt();
                    int resultD = convertToBinary(numDec);
                    System.out.printf(">> %d to binary is: %d%n", numDec, resultD);
                }
                default -> System.out.println("You need to type 1 or 2!");
            }
        } catch (InputMismatchException e) {
            System.err.format("%s: wrong type of input%n", e);
        }
    }

    public static int convertToDecimal(int numBin) {
        int decimal = 0, i = 0;
        while (true) {
            if (numBin == 0) {
                break;
            } else {
                int temp = numBin % 10;
                decimal += (int) (temp * Math.pow(2, i));
                numBin = numBin / 10;
                i++;
            }
        }
        return decimal;
    }

    public static int convertToBinary(int numDec) {
        int binary = 0, remainder, i = 1;
        while (true) {
            if (numDec == 0) {
                break;
            } else {
                remainder = numDec % 2;
                numDec /= 2;
                binary += remainder * i;
                i *= 10;
            }
        }
        return binary;
    }
}
