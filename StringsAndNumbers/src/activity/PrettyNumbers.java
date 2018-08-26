package activity;

import java.text.DecimalFormat;

/**
 * rettyNumbers
	•	In Eclipse, add a new class called PrettyNumbers with a main method to 
	package activity,  to project StringsAndNumbers
	•	Create a static method that will contain your DecimalFormat code that takes in 
	two arguments, String pattern and double value.
	•	Print out the following number 123456.789 to be displayed as 12,34,56.789

 * @author qqdipps
 *
 */
public class PrettyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		formatter("##,##,##.###", 123456.789);
	}
	public static void formatter(String pattern, double num) {
		DecimalFormat formatted = new DecimalFormat(pattern);
		String readFormatted = formatted.format(num);
		System.out.println(readFormatted);
	}
}
