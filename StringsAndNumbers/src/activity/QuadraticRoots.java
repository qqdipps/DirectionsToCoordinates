package activity;
/**
 * QuadraticRoots
	•	In Eclipse, add a new class called QuadraticRoots with a main method to package activity, 
	 to project StringsAndNumbers
	•	Create a method that when passed three doubles a, b, and c --
	 the coefficients of a quadratic equation y = ax2 + bx + c -- and prints out the 
	 two zeroes as found by the Quadratic Formula.
	•	Hint #1:  For this, you will need Math.sqrt(x), which computes the square root of its argument.
	•	Format your answers to two decimal places

 * @author qqdipps
 *
 */

public class QuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(roots(2.0,4.0,-4.0));
	

	}
	public static String roots(Double a, Double b, Double c) {
		if(a!=0 && (Math.pow(b, 2)-4*a*c) > 0) {
			Double zpos = (((-1 )* b)+Math.sqrt((Math.pow(b, 2)-4*a*c)) / (2*a));
			Double zneg = (((-1 )* b)-Math.sqrt((Math.pow(b, 2)-4*a*c)) / (2*a));;
			String xyCoordinatesPair = "(" + zpos.toString() + "," + zneg.toString() + ")";
			return xyCoordinatesPair;
		}
		else if((Math.pow(b, 2)-4*a*c) < 0){
			Double zpos = ((-1) * b+Math.sqrt((Math.pow(b,(Math.abs( 2.0)-4*a*c))) / (2*a)));
			Double zneg = ((-1) * b-Math.sqrt((Math.pow(b,(Math.abs( 2.0)-4*a*c))) / (2*a)));
			String xyCoordinatesPair = "(" + zpos.toString() + "i," + zneg.toString() + "i)";
			return xyCoordinatesPair;
		}
		else {
			return "Can not return answer, cannot divide by 0, a CANNOT EQUAL 0";
		}
	}
}
