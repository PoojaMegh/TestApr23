package tryCatch;

import Test12.Test12;

public class example1 {
	
	void m1() {
		try {
			Test12 test = null;
			System.out.println("6");
			int x = 10/0;
			System.out.println("7");
			test.display();
			System.out.println("8");
		}catch (NullPointerException ne) {
			try {
				System.out.println("4");
				String str = "techno";
				System.out.println(str);
				System.out.println(str.length());
			}finally {
				System.out.println("5");
			}
		}catch (ArithmeticException ae) {
			try {
				String str = "techno";
				System.out.println(str);
				System.out.println(str.length());
			}catch (StringIndexOutOfBoundsException se) {
				System.out.println("3");
			}finally {
				System.out.println("2");
			}
		}finally {
			System.out.println("1");
		}
	}
	public static void main(String[] args) {
		example1 ex1 = new example1();
		ex1.m1();
	}
}
