package examples;

public class CokeMachine {

	private String cup;
	public String Cup2;
	
	public CokeMachine() {

	}

	public void dispenseSprite() {
		System.out.println("pour Sprite");
		
	}
	
	public void dispenseCoke() {
		System.out.println("pour Coke");
		
	}
	private void MixCokeDrint() {
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
	}
	
	protected void printMixIntruct() {
		MixCokeDrint();
	}
}
