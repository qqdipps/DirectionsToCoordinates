package activity;

/**
 * Randomness
	•	In Eclipse, add a new class called Randomness with a main method to package activity,  
	to project StringsAndNumbers
	•	Generate a random number between 45 and 50.
	•	Print out the value. Run your code several times to verify it is within the bounds

 * @author qqdipps
 *
 */
public class Randomness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0;
		for(;!(x < 0.50 && x > 0.45); ) {
			x = Math.random();
			System.out.println(x);
		}
		x = (int)( x*100);
		System.out.println(x);
		
		int max = 50;
		int min = 45;
		double z = Math.random();
		z = (int) (z* ((max - min)+ min));
		System.out.println(z);
		
	}
}
