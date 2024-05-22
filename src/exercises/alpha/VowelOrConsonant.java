package exercises.alpha;

import java.util.Scanner;

public class VowelOrConsonant {

    //Program that checks if a letter given by the user is a vowel or consonant
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type one letter: ");
        char myLetter = reader.next().toLowerCase().charAt(0);
        switch (myLetter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The letter \"" + myLetter + "\" is a vowel.");
                break;
            default:
                System.out.println("The letter \"" + myLetter + "\" is a consonant.");
                break;
        }
        reader.close();
    }
}