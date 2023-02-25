import java.util.Locale;

public class RootsOfQuadEquation {

	public static void main(String[] args) {
	/*This program will find all the possible roots of a quadratic equation
	 *A quadratic equation has the form:
	 *ax² + bx + c = 0
	 */
	double a = 2.3, b = 4, c = 5.6;
	double root1, root2;
	double determinant = b*b -4*a*c;
	
	// The relationship b²-4ac is called determinant
	
	if (determinant > 0) {
		
		root1 = (-b + Math.sqrt(determinant))/(2*a);
		root2 = (-b - Math.sqrt(determinant))/(2*a);
		
		System.out.println("The roots are real and different.");
		System.out.format(Locale.US,"Root 1 = %.2f\nRoot 2 = %.2f", root1, root2);
		
	} else if(determinant == 0) {
		
		root1 = root2 = (-b)/(2*a);
		
		System.out.println("The roots are real and equal.");
		System.out.format(Locale.US,"Root 1 & 2 = %.2f", root1);
		
	} else {
		
		double real = (-b)/(2*a);
		double imaginary = Math.sqrt(-determinant)/(2*a);
		
		System.out.println("The roots are complex numbers and different.");
		System.out.format(Locale.US,"Root 1 = %.2f + %.2fi", real, imaginary);
		System.out.format(Locale.US,"\nRoot2 = %.2f - %.2fi", real, imaginary);
		
		}
	}
}