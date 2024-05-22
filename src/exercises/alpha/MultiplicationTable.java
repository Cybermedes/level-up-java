package exercises.alpha;

import java.util.Scanner;

public class MultiplicationTable {

    //Program that prints the multiplication table of a given number
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Print the multiplication table of: ");
        int myNum = reader.nextInt();
        int i = 0;

        do {
            System.out.printf("%d x %d = %d\n", myNum, i, myNum * i);
            i++;
        } while (i <= 10);

        reader.close();
    }
}