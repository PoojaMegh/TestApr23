package interviewQuestions;

class A {
	
}
class B extends A{
	A m1() {
		return new B();
	}
}

class C extends A {
	void display() {
		System.out.print("Hi");
	}
}
public class test6 {
	//static int var =12;
	
	public static void main(String[] args) {
		B ab = new B();
			C c = (C) ab.m1();
			c.display();
	}
}
