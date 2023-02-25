
public class AsciiValue {

	public static void main(String[] args) {
		char ch = 'a';
		int ascii = ch;
		
		int castedAscii = (int) ch;
		
		System.out.println("The ASCII value is: "+ascii);
		System.out.println("The ASCII value is: "+castedAscii);
	}
}