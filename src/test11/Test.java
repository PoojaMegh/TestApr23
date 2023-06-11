package test11;

public class Test extends XYZ{
	void m1() {
		System.out.println("Test m1");
	}
	
	public static void main(String[] args) {
		Person p = new Students();
		p.talk();
	}
	
	static void m2() {
		System.out.println("child m2");
	}
}
