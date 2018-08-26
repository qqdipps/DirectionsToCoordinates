package examples;

import examples2.SuperClass;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CokeMachine drink = new CokeMachine();
		
		drink.Cup2 = "hi";
		drink.dispenseCoke();
		drink.printMixIntruct();
		
		SuperClass sup = new SuperClass("HI");
		sup.test();
		sup.test4();
	}

}
