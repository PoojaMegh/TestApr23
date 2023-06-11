package test11;

public class Z extends Y {
	protected void m1() {
		System.out.println("Z m1");
	}
	
	public static void main(String[] args) {
		Y a = new Z();
		X c = a;
		c.m1();
	}
}
