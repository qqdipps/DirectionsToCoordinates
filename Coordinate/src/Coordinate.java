import java.util.*;
import java.lang.Character;
/**
 * The program will calculate the coordinate based 
 * on the directional commands provided: 
 * u-up, d-down, l-left, and r-right
 * @author qqdipps
 *
 */
public class Coordinate {
	
	
	/**Method numericCommandIsolator takes String  of commands
	 * and isolates then returns integers in front of any non numeric commands. NOTE if 
	 * command ends in integers they will not be returned.
	 * ie 54dlud8r72r44 will return [54, 8, 72]
	 * 
	 * @param CommandIn
	 * @return numericCommandList
	 */
	public static List<Integer> numericCommandIsolator( String commandIn){ 
		
		List<String> numStr = new ArrayList<String>(Arrays.asList("1234567890".split(""))); //Reference numbers as String List. 
		List<String> commandList = new ArrayList<String>(Arrays.asList(commandIn.split(""))); //CommandIn as String List split up like char array.
		List<Integer> numericCommandList = new ArrayList<Integer>(); // Integer list for numericCommands destination.
		
		String digitBuilder= ""; //Temp var used for building multi-digit numbers.
		
		for(String c : commandList) { //Loop adds numbers in front of non-numeric entries to numericCommandList and changes type from String to Integer. 
			if(numStr.contains(c)) { // If statement builds multi- digit number from commandList ie 9,0,2 = 902.
				digitBuilder +=c; // Expression concatenates string digits to form multi-digit strings.
			}
			else { //If c is not number then can assume end of digit. Else statement adds digit to numericCommandList and resets digitBuilder.
				if (digitBuilder!="") { //Checks if digitBuilder is not empty.
					numericCommandList.add(Integer.valueOf(digitBuilder));//Takes Integer value of String digitBuilder and adds to numericCommandList. 
				}
				digitBuilder = "";	// Resets digitBuilder.
			}
		}
		return numericCommandList;
	}
	/**
	 * Method uses scanner object to input directional commands
	 * @return String CommandIn
	 */
	public static String directionIn() {
		Scanner in = new Scanner(System.in); // set-up user input
		char [] commandInChar = in.nextLine().toUpperCase().toCharArray();//user input as char array of commands with alpha changed to upper case 
		List<Character> commandInList = new ArrayList<Character>();
		int count = 0;
		for(int i = 0; i < commandInChar.length; i++   ) {
			commandInList.add(i + count, commandInChar[i]);
			if(commandInChar[i] == 'U' ||  commandInChar[i] == 'D' || commandInChar[i] == 'L' || commandInChar[i] == 'R') {
				if ( i== 0 || Character.isLetter(commandInChar[i-1])) {
					commandInList.add(i+count, '1');
					count++;
				}
			}
		}	
		StringBuilder commandBuilder = new StringBuilder();
		for (Character c : commandInList) {
			if(c.equals(" ") || c.equals(",") || c.equals("[") || c.equals("]")){
				continue;
			}
			else {
				commandBuilder.append(c);
			}	
		}
		in.close(); // close for data leak
		String commandIn = commandBuilder.toString();
		return commandIn; //returns directions as string
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(directionIn());
		String directionsIn = directionIn();
		List<Integer>numericCommands = numericCommandIsolator(directionsIn);
		System.out.println(planeCoordinates(numericCommands, directionsIn));
		System.out.println(directionsIn);
		System.out.println(numericCommands);
	}
		

	public static String planeCoordinates (List<Integer> numericCommands, String directionsIn ) {//returns cartesian plane coordinates based on directional alphanumeric commands starting from origin (0,0)
		Map<String,Integer>conversionMap = new HashMap<String,Integer>(); //conversion map commands to coordinates
		conversionMap.put("U",1);
		conversionMap.put("D", -1);
		conversionMap.put("L", -1);
		conversionMap.put("R", 1);
		int xpos = 0;
		int xneg = 0;
		int ypos = 0;
		int yneg = 0;
		
		char [] charDirect = directionsIn.toCharArray();
			
		int indexNum = 0;
		int count = 0;
		for (Integer num :numericCommands) {
//			System.out.println(i);
			indexNum = directionsIn.indexOf(num.toString(), count + indexNum);
		
			//System.out.println(indexNum);
			directValues:for(int w = 0; (w) < directionsIn.length(); w++) {
			 //System.out.println(charDirect[indexNum+w]);	
				switch(charDirect[indexNum+w]) {
					case 'U' :
						ypos = num * conversionMap.get("U") + ypos;
						System.out.println("U" + ypos);
						break directValues;
					case 'D' :
						 yneg = num * conversionMap.get("D") + yneg;						 
						 System.out.println("D" + yneg);
						 break directValues;
					case 'R':
						xpos = num * conversionMap.get("R") + xpos;
						System.out.println("R" + xpos);
						break directValues;
					case 'L':
						xneg =  num * conversionMap.get("L") + xneg;
						System.out.println("L" + xneg);
						break directValues;
					default:
						if (Character.isDigit(charDirect[indexNum])){
							count=1;
							continue directValues;
						}
						else {
							break directValues;
						}	
					}	
				}
			}
			Integer xCoordinate = xpos + xneg;
			Integer yCoordinate = ypos + yneg;
			
			String xyCoordinates = "(" + xCoordinate.toString() + "," + yCoordinate.toString() + ")";
			return xyCoordinates;	
		}
	}	
