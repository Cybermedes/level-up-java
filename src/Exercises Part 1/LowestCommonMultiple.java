
public class LowestCommonMultiple {

	//Program that calculates the Lowest Common Multiple between 2 ints
	public static void main(String[] args) {
		int numOne = 10, numTwo = 20, gcd = 1;
		
		for (int i = 1; i <=numOne && i <=numTwo; i++) {
			if (numOne%i == 0 && numTwo%i == 0) {
				gcd = i;
			}			
		}
		int lcm = (numOne * numTwo)/gcd;
		System.out.printf("The LCM of %d & %d is %d", numOne, numTwo, lcm);
	}
}