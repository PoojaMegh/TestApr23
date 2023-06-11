package test11;

public class YY extends XX{
	protected static void m1() {
		System.out.println("YY m1");
	}
	
	public static void main(String[] args) {
		XX x = new YY();
		x.m1();
	}
}
