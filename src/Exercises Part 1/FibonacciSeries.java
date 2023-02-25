import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Calculate the Fibonacci series up to th nth term: ");
		int numLimit = reader.nextInt();
		
		int firstTerm=0, secondTerm=1, i=1;
		
		do {
			int nextTerm = firstTerm + secondTerm;
			System.out.printf("%d\n",firstTerm);
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			i++;
			
		} while (i<=numLimit);
		
		reader.close();
	}
}