package Test12;

public class Test12 {
	/*	public static void main(String[] args) {
		int m = 1010, n = 1010;
		System.out.println(m++ / ++n * n-- / --m`);
	}
}

/*	public static void main(String[] args) {
		int a = 11++;
		
		System.out.println(a);
	}
	*/
	public void display() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		int a = 1; 
		int b =2;
		int c = a++ + ++b;
		int d = --a + --b + c--;
		System.out.println(d);
	}
}