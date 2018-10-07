import java.util.Scanner;

public class vigenere{

		public static char[][] table;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the plaintext: ");
		String plaintext = sc.nextLine();
		System.out.println("Enter the key: ");
		String key = sc.nextLine();

		int[] check = new int[26];

		int i;
		for(i = 0; i < 26; i++){
			check[i] = 0;
		}

		table = new char[5][5]; 

		//Construct table.

		
	}
}