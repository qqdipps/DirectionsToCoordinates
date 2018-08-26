import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* The program will calculate the coordinate based 
* on the directional commands provided: 
* u-up, d-down, l-left, and r-right, directions are not case sensitive may include vectors and
* will accept alpha-numeric entry and will ignore non-directional commands 45U8D9klmnop&^!! will return (-1,37).
* @author qqdipps
*
*/
public class DirectionsToCoordinates {

	/**
	 * Constructor passes location for print statement prompting user to input direction
	 * commands.
	 * @param location
	 */
	public DirectionsToCoordinates(String location) {
		System.out.print("Please input dirctional commands to " + location + ": ");
	}
	
	/**
	 * Main.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DirectionsToCoordinates toDownTown = new DirectionsToCoordinates(whereToGoInput());
		toDownTown.commandToCoordinates(directionCommandInputToCharArray());
	}
	
	/**
	 * Requests and accepts user to input location for requested coordinates.
	 * 
	 * @return String location
	 */
	public static String whereToGoInput() {
		System.out.print("Where are you going? ");
		Scanner in = new Scanner(System.in);//user input for location
		String location = in.nextLine().toLowerCase();
		return location;
	}
	
	/**
	 * Accepts user input of direction commands for given location and returns input as uppercase char [].
	 * @return char [] commandInChar
	 */
	public static char [] directionCommandInputToCharArray() {
		Scanner in = new Scanner(System.in); // set-up user input
		char [] commandInChar = in.nextLine().toUpperCase().toCharArray();//user input as char array of commands with alpha changed to upper case
		return commandInChar;
	}
	/**
	 * Prints coordinates for requested location after converting char [] commandInChar direction commands to cartesian plane coordinates.
	 * numeric commands preceeding directional alpha commands are seperated and used for calculation of vector.  
	 * Note: method will accept alpha-numeric entry and will ignore non-directional commands 45U8D9klmnop&^!! will return (-1,37).  
	 * @param commandInChar
	 */
	public void commandToCoordinates(char [] commandInChar) {
		Integer xpos = 0;
		Integer xneg = 0;
		Integer ypos = 0;
		Integer yneg = 0;		
		StringBuilder digitBuilder = new StringBuilder();
		for(int i = 0; i < commandInChar.length; i++   ) {
			switch (commandInChar[i]) {
			case 'U':
				ypos = xyAxis(digitBuilder, ypos, 'U', commandInChar, i);
				break;
			case 'D':
				yneg = xyAxis(digitBuilder, yneg, 'D', commandInChar, i);
				break;
			case 'L':
				xpos = xyAxis(digitBuilder, xpos, 'L', commandInChar, i);
				break;
			case 'R':
				xneg = xyAxis(digitBuilder, xneg, 'R', commandInChar, i);
				break;
			default:
				if (Character.isDigit(commandInChar[i])){
					digitBuilder.append(commandInChar[i]);
					continue;
				}
				else {
					digitBuilder.delete(0, digitBuilder.length());
					break;	
				}
			}
		}
		
		System.out.print("The coordinates conversion is " + xyCoordinates(xpos,xneg,ypos,yneg) + ".");
	}
	
	/**
	 * Converts xyAxis Integer variables to (X,Y) String coordinates. 
	 * Prints to console with following UX statement.
	 * @param xpos
	 * @param xneg
	 * @param ypos
	 * @param yneg
	 */
	public static String xyCoordinates(Integer xpos, Integer xneg,Integer ypos,Integer yneg) {
		Integer xCoordinate = xpos + xneg;
		Integer yCoordinate = ypos + yneg;
		
		String xyCoordinatesPair = "(" + xCoordinate.toString() + "," + yCoordinate.toString() + ")";
		return xyCoordinatesPair;
	}

	/**
	 * Method uses hashMap to convert alpha directions to numeric directions and 
	 * used to return xyAxis Integer variables. 
	 * @param digitBuilder
	 * @param xy
	 * @param key
	 * @param commandInChar
	 * @param i
	 * @return Integer xy
	 */
	public static Integer xyAxis(StringBuilder digitBuilder, Integer xy, Character key, char [] commandInChar, int i) {
		Map<Character,Integer>conversionMap = new HashMap<Character,Integer>(); //conversion map commands to coordinates
		conversionMap.put('U', 1);
		conversionMap.put('D', -1);
		conversionMap.put('L', -1);
		conversionMap.put('R', 1);
		if (i==0 || !(Character.isDigit(commandInChar[i-1]))) {
			digitBuilder.append('1');					
		}
		xy = Integer.valueOf(digitBuilder.toString()) * conversionMap.get(key) + xy;
		digitBuilder.delete(0, digitBuilder.length());
		return xy;
	}
}
