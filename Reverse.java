/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String userString = args[0];
		String reversed = "";
		for (int i = userString.length() - 1; i >=0; i--){
			reversed += userString.charAt(i);
		}

		System.out.println(reversed);
		
		if (userString.length() % 2 == 0){
			System.out.println("The middle character is " + reversed.charAt(reversed.length() / 2));

		}
		else {
			System.out.println("The middle character is " + reversed.charAt((reversed.length() - 1) / 2));
		}


		
		
	}
}
