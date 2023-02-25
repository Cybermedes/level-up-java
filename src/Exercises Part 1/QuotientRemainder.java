
public class QuotientRemainder {
	
	public static void main(String[] args) {
		
		int dividend = 1247236; int divisor = 4;
		
		int quotient = dividend / divisor;
		int remainder 	= dividend % divisor;
		
		System.out.printf("The division of %d / %d:\n", dividend, divisor);
		System.out.println("The quotient = "+quotient);
		System.out.println("The reminder = "+remainder);
	}
}