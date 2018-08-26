package examples2;

public class SuperClass {
	private String str1;
	
	public SuperClass(String str1) {
		this.str1 = str1;
	}
	
	public void test () {
		System.out.println("Made it here superclass!");
		
	}
	
	public void printMethod() {
		System.out.println("Printed From SuperClass");
		
	}
	
	private void test2() {
		System.out.println("can't find me cept super");
	}
	
	protected void test3() {
		System.out.println("proctected must be seen from same package");
		
	}
	
	public void test4() {
		test2();
		test3();
		
	}
}
