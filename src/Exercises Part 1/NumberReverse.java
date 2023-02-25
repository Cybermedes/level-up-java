import java.util.Scanner;

public class NumberReverse {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What number do you want to reverse? ");
		int myNum = scanner.nextInt();
		int inverted = 0;
		
		System.out.println("Original number: "+myNum);
		
		while (myNum != 0) {
			int digit = myNum % 10;
			inverted = inverted*10 + digit;
			myNum /= 10;
		}
		
		System.out.println("The reversed: "+inverted);
		scanner.close();
	}
}