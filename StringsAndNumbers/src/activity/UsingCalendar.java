package activity;

import java.util.Calendar;

/**
 * UsingCalendar
	•	In Eclipse, add a new class called UsingCalendar with a main method 
	to package activity,  to project StringsAndNumbers
	•	Create a Calendar object and get an instance of the Calendar class
	•	Using the context popup in eclipse find the appropriate method to 
	set a date to the stock market crash, “Black Tuesday” (October 29, 1929)
	•	Print out “The stock market crashed on October 29, 1929”
	•	Format the date to now print out “The stock market crashed on 10/29/29”
 * @author qqdipps
 *
 */
public class UsingCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(1929,  9, 29);
		String cDate = String.format("%tB %td, %tY", c,c,c);
		System.out.println(cDate);
		
	}

}
