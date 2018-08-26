import java.util.List;

public class StringX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringXs = "xosdidxxfxjxsfx";
		System.out.println(removeX(stringXs));
		

	}

	private static String removeX(String stringXs) {
		// TODO Auto-generated method stub
		char [] xChar = stringXs.toCharArray();
		char firstX = xChar[0];
		char lastX = xChar[xChar.length-1];
		
		String strX = stringXs.substring(1,stringXs.length());
		
		StringBuilder strXX = new StringBuilder();
		char [] charX = strX.toCharArray();
		for (char x : charX) {
			if (x != 'x') {
				strXX.append(x);
			}
		}
		String XX = firstX + strXX.toString() + lastX;
		return XX;
		
	}

}
