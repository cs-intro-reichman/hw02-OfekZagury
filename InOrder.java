/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int checker = 0;
		int randomNum = (int)(Math.random() * 10);

		while (randomNum >= checker) {
			System.out.print(randomNum + " ");
			checker = randomNum;
			randomNum = (int)(Math.random() * 10);
		}
	}
}
