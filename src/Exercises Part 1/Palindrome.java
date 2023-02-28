import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("What type of palindrome, string or int? ");
		String paliType = scanner.nextLine();
		
		switch (paliType) {
		case "string":
			System.out.print("Type the word: ");
			String str = scanner.next();
			String reverseStr = "";
			
			int strLength = str.length();
			for (int i = strLength-1; i>=0; i--) {
				reverseStr = reverseStr + str.charAt(i);
				System.out.println(reverseStr);
			}
			if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
				System.out.println(str + " is a Palindrome String.");
		    }
			else {
		    	System.out.println(str + " is not a Palindrome String.");
			}
			break;
			
		case "int":
			System.out.print("Type one number: ");
			int numb = scanner.nextInt();
			int reverseNumb = 0;			
			int originalNum = numb;
		    
		    while (numb != 0) {
		      int remainder = numb % 10;
		      reverseNumb = reverseNumb * 10 + remainder;
		      numb /= 10;
		      System.out.println(reverseNumb);
		    }
		    if (originalNum == reverseNumb) {
		      System.out.println(originalNum + " is Palindrome number.");
		    }
		    else {
		      System.out.println(originalNum + " is not Palindrome number.");
		    }
			break;

		default:
			System.out.println("Type string or int.");
			break;
		}
		scanner.close();
	}
}