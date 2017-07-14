import java.util.Scanner;

public class UserInput{
	/*
  append
Put String, int, char, etc.. on end 
  insert
Insert String, int, char, etc... into middle
  charAt
Gets character at specified index
  setCharAt
Changes the character at specified index
  toString
Get back String that you made
	 */
	static StringBuilder sb = new StringBuilder("hello world");
	static String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
	public static StringBuilder cipher(StringBuilder sb, int key){
		for(int i = 0; i < sb.length(); i++){
			char index = sb.charAt(i);
			if(index != ' '){
				int ind = alphabet.indexOf(index);
				ind += key;
				sb.setCharAt(i, alphabet.charAt(ind));
			}
		}
		return sb;
	}
	public static void main(String[]args){
		Scanner console = new Scanner(System.in);
		System.out.println("What is your string? ");
		String phrase = console.nextLine();
		System.out.println("What is the key?" );
		int key = console.nextInt();
		StringBuilder sbp = new StringBuilder(phrase);
			System.out.println(cipher(sbp, key));
		System.out.println('a' - 3);
	}
	/*String encr = alphabet.substring(key);
	encr = encr + alphabet.substring(0, key);*/
}