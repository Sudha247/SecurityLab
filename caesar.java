import java.util.*;

public class caesar{


	public static String[] dict = {"Hello", "World"}; // 2
	public static String encrypt(String plaintext, int displacement){

		int i;
		String temp = "";

		for(i = 0; i < plaintext.length(); i++){
			char c = plaintext.charAt(i);

			if(c == ' '){
				temp += " "; continue;
			}

			if(Character.isUpperCase(c) == true){
				temp += (char)(((int)c - (int)'A' + displacement) % 26 + (int) 'A');
			}

			if(Character.isLowerCase(c) == true){
				temp += (char)(((int)c - (int)'a' + displacement) % 26 + (int) 'a');
			}
		}

		return temp;
	}

	
	//DECRYPT IS ENCRYPT(plaintext, -displacement)

	public static String cryptanalysis(String ciphertext){

		String[] brute = new String[26];
		int i;
		String temp;
		for(i = 0; i < 26; i++){
			temp = encrypt(ciphertext, 26-i);
			//System.out.println(-1*i + temp);
			brute[i] = temp;
			//System.out.println(brute[i]);
		}

		for(i = 0; i < 26; i++){
			String[] words = brute[i].split(" ");
			for(int j = 0; j < 2; j++){
				//System.out.println(brute[i] + " " + words[0] + " " + dict[j]);
				//System.out.println(words[0].equals(dict[j]));
				if(words[0].equals(dict[j])){return brute[i];}
			}
		}	
		return "-1";
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the plaintext: ");	
		String plaintext = sc.nextLine();

		System.out.println("\n\nPlaintext = " + plaintext);

		System.out.println("Enter the displacement value: ");
		int displacement = sc.nextInt();
		String ciphertext = encrypt(plaintext, displacement);
		System.out.println("ciphertext = " + ciphertext);

		//Decryption
		System.out.println("Decrypted = " + encrypt(ciphertext, 26 - displacement));
		System.out.println("Cryptanalysis = " + cryptanalysis(ciphertext));

	}
}