package exercises.beta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RemoveBlankSpace {

    // Program that removes the blank space of a string typed by the user
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            String userText = reader.nextLine();
            System.out.println("The original text: \"" + userText + "\"");
            userText = userText.replaceAll("\\s", "");
            System.out.println("The text without blank spaces: \"" + userText + "\"");

        } catch (InputMismatchException e) {
            System.err.format("%s: wrong type of input%n", e);
        }
    }
}
