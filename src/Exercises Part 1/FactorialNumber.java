import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Do the factorial of : ");
		int myInt = reader.nextInt();
		int factor = 1;
		
		
		if (myInt == 0) {
			System.out.println("The factorial of zero is 1.");
		} else {
			
			for (int i = 1; i <= myInt; i++) {
				factor = factor * i;
			}
			
			System.out.printf("THe factorial of %d! = %d", myInt, factor);
		}
		
		reader.close();
	}
}