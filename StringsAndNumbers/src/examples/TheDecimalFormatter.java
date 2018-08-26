package examples;
import java.text.DecimalFormat;

public class TheDecimalFormatter {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			customFormat("##,###.##", 234234234.43);

		}
		public static void customFormat(String pattern, double value) {
			DecimalFormat myFormat = new DecimalFormat(pattern);
			String output = myFormat.format(value);
			System.out.println(output);
		}
	}
