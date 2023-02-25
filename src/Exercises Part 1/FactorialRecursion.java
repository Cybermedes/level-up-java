import java.util.Scanner;

public class FactorialRecursion {
	
	//Find and display the factorial of a number by using recursion
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Calculate the factorial of: ");
		int myNum = scanner.nextInt();
		int factor = makeFactorial(myNum);
		
		System.out.printf("Factorial of %d! = %d", myNum, factor);
		scanner.close();
	}
	
	public static int makeFactorial(int numb) {
		if(numb >= 1) {
			return numb * makeFactorial(numb - 1);
		} else {
			return 1;
		}
	}
}