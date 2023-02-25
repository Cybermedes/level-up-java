import java.util.Scanner;

public class SumAllNatural {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Sum all the numbers from one up to: ");
		int numLimit = reader.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= numLimit; i++) {
			sum += i;
		}
		
		System.out.println("The sum of all numbers is "+sum);
		reader.close();
	}
}