package exercises.beta;

import java.util.Scanner;

public class StringReverseRecursion {

    // Program that reverse a string by using recursion
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Type anything: ");
            String myString = reader.next();

            String stringRever = reverse(myString);
            System.out.println("The sentence backwards is \"" + stringRever + "\"");
        }
    }

    public static String reverse(String myString) {
        if (myString.isEmpty()) {
            return myString;
        }
        return reverse(myString.substring(1)) + myString.charAt(0);
    }
}
