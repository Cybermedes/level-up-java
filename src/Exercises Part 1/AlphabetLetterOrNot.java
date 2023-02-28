import java.util.Scanner;

public class AlphabetLetterOrNot {

	//Program to check if the input is a letter or not	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Please, type a character: ");
		char myChar = reader.next().charAt(0);
		
		if ((myChar >= 'A' && myChar <= 'z')) {
			System.out.println("The character "+myChar+" is a letter.");
		} else {
			System.out.println("The character "+myChar+" is not a letter.");
		}
		
		reader.close();
	}
}