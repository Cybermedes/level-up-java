import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Type one number: ");
		int myNumber = reader.nextInt();
		
		if (myNumber % 2 == 0) {
			System.out.println("Your number "+myNumber+" is even.");
		} else {
			System.out.println("Your number "+myNumber+" is odd.");
		}
		
		reader.close();
	}
}