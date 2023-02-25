
public class DisplayTriangle {
	
	public static void printTriangle(Object[] arr) {
		
		for(int row = 0; row<arr.length; row++) {
			
			for(int col = 0; col<=row; col++) {
				
				System.out.print(arr[col]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Object[] numero = new Object[] {1,2,3,4,5,6};
		printTriangle(numero);
		
		Object[] letras = new Object[] {'A','B','C','D','E','F'};
		printTriangle(letras);
		
		Object[] vazio = new Object[] {};
		printTriangle(vazio);
		
		Object[] intro = new Object[] {"Hello","Hi","Hey"};
		printTriangle(intro);
				
	}
}