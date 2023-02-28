
import java.util.Scanner;

public class StepCounterToZero {

	/*Number of steps to reduce a number to zero
	Given an integer num, return the number of steps to reduce it to zero.
	In one step, if the current number is even, you have to divide it by 2;
	otherwise, you have to subtract 1 from it.*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number:");
		int num = scanner.nextInt();
		int step =1;
		while(num>0) {
			System.out.print("Step "+step+") ");
		
			if(num%2==0) {
				System.out.print(num+" is even; divide by 2 and obtain ");
				num = num / 2;
				System.out.println(num+".");
			} else {
				System.out.print(num+" is odd; subtract 1 and obtain ");
				num = num - 1;
				System.out.println(num+".");
			}
			step++;
		}
		scanner.close();
	}
}