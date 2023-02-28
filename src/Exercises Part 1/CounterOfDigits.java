import java.util.Scanner;

public class CounterOfDigits {

	//Program that counts the number of digits of an input integer
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type one number: ");
		int myNum = reader.nextInt();
		int num = myNum;
		int counter = 0;
		
		while (num != 0) {
			num /= 10;
			counter++;
		}
		System.out.println("The number "+myNum+" has "+counter+" digit(s).");
		reader.close();
	}
}