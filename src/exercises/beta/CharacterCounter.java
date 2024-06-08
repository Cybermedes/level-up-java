package exercises.beta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterCounter {

    /* Program that counts how many times the character chosen by the user
    appears on string typed by the user as well
     */
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            char myChar;
            String userText;

            System.out.print("Pick up a character. Anyone from a to z: ");
            myChar = reader.nextLine().charAt(0);
            System.out.println("Type a text, any text that you want:");
            userText = reader.nextLine();

            int charCounter = 0;
            for (int i = 0; i < userText.length(); i++) {
                if (myChar == userText.charAt(i)) {
                    charCounter++;
                }
            }
            if (charCounter == 0) {
                System.out.printf("The char \"%c\" doesn't appear " +
                        "anytime on your text.%n", myChar);
            } else {
                System.out.printf("The char \"%c\" appears %d " +
                        "times on your text.%n", myChar, charCounter);
            }
        } catch (InputMismatchException e) {
            System.err.format("%s: wrong type of input%n", e);
        }
    }
}
