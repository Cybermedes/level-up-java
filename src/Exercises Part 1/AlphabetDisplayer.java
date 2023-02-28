
public class AlphabetDisplayer {

	//Print all the alphabet letters uppercase and lowercase
	public static void main(String[] args) {
		
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