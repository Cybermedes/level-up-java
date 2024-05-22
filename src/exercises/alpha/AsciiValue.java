package exercises.alpha;

import java.util.Scanner;

public class AsciiValue {

    //Program that shows the ASCII value of a character
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        System.out.println("The ASCII character: " + ch);
        System.out.println("The ASCII value is: " + (int) ch);
        scanner.close();
    }
}