import java.util.Scanner;

public class SumTwoPrime {
	
	//Check if a number can be expressed as the sum of 2 prime numbers
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("What number to check? ");
		int numb = reader.nextInt();
		boolean flag = false;
		
		for (int i = 2; i <= numb/2; i++) {
			
			if (checkPrime(i)) {
				if(checkPrime(numb - i)) {
					System.out.printf("%d = %d + %d\n",numb, i, numb - i);
					flag = true;
				}
			}
		}
		
		if(flag == false)
			System.out.println("No possible match for your number "+numb);
		
		reader.close();
	}
	
	//Method to check if it's prime
	static boolean checkPrime(int numb) {
		boolean isPrime = true;
		
		for (int i = 2; i <= numb/2; i++) {
			if (numb % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
}