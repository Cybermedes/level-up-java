package exercises.beta;

import java.util.Scanner;

public class BinaryToOctal {
    //Program that convert binary to octal and vice-versa
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("What conversion do you want to do?\n"
                + "(1) from binary to octal;\n"
                + "(2) from octal to binary;");
        int choice = reader.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Type the binary: ");
                int numBin = reader.nextInt();
                //Using methods from the BinaryToDecimal & OctalToDecimal classes
                int resultO = OctalToDecimal.convertToOctal(BinaryToDecimal.convertToDecimal(numBin));
                System.out.printf(">>> %d to decimal is: %d", numBin, resultO);
                break;

            case 2:
                System.out.println("Type the octal: ");
                int numOct = reader.nextInt();
                //Using methods from the BinaryToDecimal & OctalToDecimal classes
                int resultB = BinaryToDecimal.convertToBinary(OctalToDecimal.convertToDecimal(numOct));
                System.out.printf(">>> %d to binary is: %d", numOct, resultB);
                break;

            default:
                System.out.println("You need to type 1 or 2!");
                break;
        }
        reader.close();
    }
}