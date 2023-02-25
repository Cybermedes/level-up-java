import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double d1,d2;
		
		try {
			System.out.println("Enter a numeric value 1: ");
			d1 = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("Enter a numeric value 2: ");
			d2 = scanner.nextDouble();
			scanner.nextLine();
		
		} catch (InputMismatchException e) {
			System.out.println("Please type a number.");
			return;
		}
		
		System.out.println("Select the math operation that you want (+ - * /): ");
		String operation = scanner.nextLine();
		
		double result;
		
		switch (operation) {
		case "+":
			result = d1 + d2;
			break;
		case "-":
			result = d1 - d2;
			break;
		case "*":
			result = d1 * d2;
			break;
		case "/":
			result = d1 / d2;
			break;
		default:
			System.out.println("You didn't choose a valid operator.");
			return;			
		}
		System.out.println("Your result is: " + result);
		scanner.close();
	}
}