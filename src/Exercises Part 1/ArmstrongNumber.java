import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type one number: ");
		int numberToCheck = scanner.nextInt();
		int originalNumber, result =0, digits = 0, tempVar;
		
		originalNumber = numberToCheck;
		tempVar = numberToCheck;
		
		while (tempVar > 0)
        {
            tempVar /= 10;
            digits++;
        }
		
		while (numberToCheck > 0) {
			int lastDigit = numberToCheck % 10;
			result += Math.pow(lastDigit, digits);
			numberToCheck /= 10;
		}
		
		System.out.println("Number of digits "+digits);
		if (result == originalNumber) {
			System.out.println(originalNumber+" is an Armstrong Number.");
		} else {
			System.out.println(originalNumber+" is not an Armstrong Number.");
		}
		scanner.close();
	}
}