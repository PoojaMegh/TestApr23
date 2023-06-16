package tryCatch;

public class Example2 {
	void m1(String str) {
		try {
			int num = Integer.parseInt(str);
			System.out.println(num);
		}catch (NumberFormatException ne) {
			m2();
		}finally {
			m3();
			System.out.println("Hi");
		}
		System.out.println("credits");
	}
	
	void m2() {
		System.out.println("in m2");
	}
	void m3() {
		try {
			int x = 10/0;
			System.out.println("in m3");
		}catch (ArithmeticException ae) {
			System.out.println("catch");
		}finally {
			System.out.println("all set");
		}
		
	}
	
	public static void main(String[] args) {
		Example2 ex2 = new Example2();
		ex2.m1("Maulik");
	}
}
