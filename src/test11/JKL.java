package test11;

public abstract class JKL {
	public static void main(String[] args) {
	//	m1();
	}
	
	static void m1(String name, String city) {
		System.out.println(name + " " + city);
	}
	
	static void m1(String city, int roll) {
		System.out.println(city + " " + roll);
	}
	
	abstract void m1();
}
