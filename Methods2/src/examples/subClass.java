package examples;

import examples2.SuperClass;

public class subClass extends SuperClass{

	public subClass(String str2) {
		super(str2);

		// TODO Auto-generated constructor stub
		System.out.println(str2);
	}
		
	public void printMethod() {
			super.printMethod();
			System.out.println("Printed From SubClass");
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str2 = "me";
		subClass s = new subClass(str2);
		System.out.println(" ");
		s.test();
		s.test3(); // can access due to inherit superclass
		s.printMethod();
	}

}
