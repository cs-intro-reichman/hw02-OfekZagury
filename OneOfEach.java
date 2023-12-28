
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		int counter = 0;
		boolean isBoy = false;
		boolean isGirl = false;
		double gender = 0.0;

		while (!isBoy || !isGirl) {

		    gender = Math.random();

			if (gender < 0.5) {
			isGirl = true;
			System.out.print(" g");

		      } else {
			     isBoy = true;
		         System.out.print(" b");
		      }
 
		    counter++;
		     
		}
		
		System.out.println();
		System.out.println(" You made it... and you now have " + counter + " children");
		
	}
		

}
