package activity;
/**
 * rigValues
	•	In Eclipse, add a new class called TrigValues with a main method to package activity,  
	to project StringsAndNumbers
	•	Create a method that when passed a double (in degrees, not radians) it prints out the sine, 
	cosine, and tagent for that angle
	•	Hint #1:  For this, you will need Math.sin(x), Math.cos(x), and Math.tan(x).
	•	Hint #2:  These Math functions accept angles in radians, not degrees.  You'll have to do 
	something about that! ( radians = degrees * π/180)
	•	Format your answers to two decimal places

 * @author qqdipps
 *
 */

public class trigValues {
	public static void main(String[] args) {
		angle(90);
		
	}

	private static void angle(double degrees) {
		// TODO Auto-generated method stub
		double radians = degrees * Math.PI/100;
		double sinAns = Math.sin(radians);
		double cosAns = Math.cos(radians);
		double tansAns = Math.tan(radians);
		System.out.println(String.format("%.2f", sinAns));
	}

}
