
public class DoublesX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String xString = "xxiuxxlsfdkx";
	System.out.println(methodX(xString));
	}

	public static boolean methodX(String xString) {
		// TODO Auto-generated method stub
		xString = xString.toLowerCase();
		if (xString.contains("x")){
			int index1X = xString.indexOf("x");
			int index2X = xString.indexOf("x", index1X+1);
			if (index2X-index1X == 1) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
			}
	}
}
	

