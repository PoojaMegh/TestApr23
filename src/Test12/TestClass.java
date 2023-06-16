package Test12;

public class TestClass {
	
	int x =5;
	
	TestClass () {
		System.out.println(x);
	}
	
	{
		int x=10;
		System.out.println(x);
	}
	void display() {
		int x=15;
		System.out.println(x);
		System.out.println(this.x);
	}
}



