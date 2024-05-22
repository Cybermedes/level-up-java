package exercises.beta;

import java.util.Scanner;

public class CharacterCounter {

    /*Program that counts how many times the character chosen by the user
    appears on string typed by the user as well
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Pick up a character. Anyone from a to z: ");
        char myChar = reader.nextLine().charAt(0);
        System.out.println("Type a text, any text that you want:");
        String userText = reader.nextLine();

        int charCounter = 0;
        for (int i = 0; i < userText.length(); i++) {
            if (myChar == userText.charAt(i)) {
                charCounter++;
            }
        }
        if (charCounter == 0) {
            System.out.printf("Your char \"%c\" doesn't appear anytime on your text.", myChar);
        } else {
            System.out.printf("Your char \"%c\" appears %d times on your text.", myChar, charCounter);
        }
        reader.close();
    }
}