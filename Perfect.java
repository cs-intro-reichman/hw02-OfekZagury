/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here

		int userInt = Integer.parseInt(args[0]);
		int sumOfDivisors = 1;
		String answer = userInt + " is a perfect number since " + userInt + " = 1";

	    for (int i = 2; i < userInt; i++) {
			if (userInt % i == 0) {
				answer += " + " + i;
				sumOfDivisors += i;
			}
		}

		if (sumOfDivisors == userInt) {
			System.out.println(answer);
		} else {
			System.out.println(userInt + " is not a perfect number");
		}




		

		

	}
}
