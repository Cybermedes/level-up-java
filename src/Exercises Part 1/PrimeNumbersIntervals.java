import java.util.Scanner;

public class PrimeNumbersIntervals {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the interval that you want?");
		System.out.print("Start: ");
		int startInter = scanner.nextInt();
		
		System.out.print("End: ");
		int endInter = scanner.nextInt();
		
		System.out.println("The prime numbers of the interval: ");
		
		while (startInter < endInter) {
            boolean flag = false;

            for(int i = 2; i <= startInter/2; i++) {
                
                if(startInter % i == 0) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag && startInter != 0 && startInter != 1) {
                System.out.print(startInter+ " ");
            }
            startInter++;
        }
		
		scanner.close();
	}
}