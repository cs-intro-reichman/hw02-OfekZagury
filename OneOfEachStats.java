import java.util.Random;
public class OneOfEachStats {
	public static void main (String[] args) {

		double families = Double.parseDouble(args[0]);
		int seed = Integer.parseInt(args[1]); 
		Random generator = new Random(seed); 
		boolean isBoy; boolean isGirl;
		double gender = 0.0;
		int counts2 = 0; int counts3 = 0; int counts4orMore = 0;
		int counter = 0;
		double sumOfKids = 0.0;

		for (int i = 0; i < families; i++) {
			counter = 0;
		    isBoy = false;
		    isGirl = false;
		   while (!isBoy || !isGirl) {

		       gender = generator.nextDouble();

			   if (gender < 0.5) {
			    isGirl = true;
		          } else 
			         isBoy = true;

		       counter++; 
		       sumOfKids++;
            }
		   if (counter == 2) {
			counts2++;
		     } else if (counter == 3) {
			    counts3++;
		       } else 
			      counts4orMore++;
        }
            int mostCommon = counts2;
            String theMostCommon = "2";
            
            if (counts3 > counts2) {
            	mostCommon = counts3;
            	theMostCommon = "3";
            }

            if (counts4orMore > mostCommon) {
            	mostCommon = counts4orMore;
            	theMostCommon = "4 or more";
            }

            double average = (double)(sumOfKids / families);
            
			System.out.println("Average: " + average + " children to get at least one of each gender.");
			System.out.println("Number of families with 2 children: " + counts2);
			System.out.println("Number of families with 3 children: " + counts3);
			System.out.println("Number of families with 4 or more children: " + counts4orMore);
			System.out.println("The most common number of children is " + theMostCommon + ".");

		}
	}
	
		

		

