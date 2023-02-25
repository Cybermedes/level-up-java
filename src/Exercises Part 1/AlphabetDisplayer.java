
public class AlphabetDisplayer {
	public static void main(String[] args) {
	//Print all the alphabet letters uppercase and lowercase
		
		char firstLetter = 'a';
		char firstLetterUpper = 'A';
		
		for (char i = firstLetter; i <= 'z'; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (char i = firstLetterUpper; i <= 'Z'; i++) {
			System.out.print(i+" ");
		}
	}
}