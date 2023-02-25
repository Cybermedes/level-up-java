
public class GreatestCommonDivisor {
	
	public static void main(String[] args) {
		
		int numOne = 100, numTwo = 120, gcd = 1;
		
		if (numOne == numTwo) {
			System.out.println("The GCD of "+numOne+" is the number itself.");
		} else {
			for (int i = 1; i<=numOne && i<=numTwo; i++) {
				if (numOne % i ==0 && numTwo % i ==0) {
					gcd = i;
				}
			}
			System.out.printf("The GCD of %d & %d is %d",numOne,numTwo,gcd);
		}	
	}
}