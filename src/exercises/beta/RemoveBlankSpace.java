package exercises.beta;

import java.util.Scanner;

public class RemoveBlankSpace {

    //Program that removes the blank space of a string typed by the user
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String userText = reader.nextLine();

        System.out.println("The original text: \"" + userText + "\"");
        userText = userText.replaceAll("\\s", "");
        System.out.println("The text without blank spaces: \"" + userText + "\"");
        reader.close();
    }
}
