package examples;

import java.util.Date;
import java.util.Calendar;

public class DateFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//date class
		Date d = new Date();
		System.out.println(d.toString());
		String dTime = String.format("%tB %te %tY", d,d,d);
		
		System.out.println(dTime);
		
		@SuppressWarnings("deprecation")
		Date d1 = new Date(2018-1900, 9-1, 23);
		System.out.println(d1.toString());
	
		//Calendar Class
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime().toString());
		String cTime = String.format("%tB %te %tY", c,c,c);
		System.out.println(cTime);
	}

}
