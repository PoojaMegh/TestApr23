package test11;

public class Overload {
	public static void main(String[] args) {
		m1('c');
	}
	
	static void m1(char a) {
		System.out.println(a);
	}
	
	static void m1(String name) {
		System.out.println(name);
	}
}
