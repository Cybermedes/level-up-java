package exercises.alpha;

import java.util.Scanner;

public class AlphabetLetterOrNot {

    // Check if the input character is a letter or not
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Please, type a character: ");
        char myChar = reader.next().charAt(0);

        if ((myChar >= 'A' && myChar <= 'Z') || (myChar >= 'a' && myChar <= 'z')) {
            System.out.println("The character '" + myChar + "' IS a letter.");
        } else {
            System.out.println("The character '" + myChar + "' IS NOT a letter.");
        }

        reader.close();
    }
}