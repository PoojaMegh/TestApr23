package a;

public class A {
	
	final public int x=10;
	static public int y=20;
	
	public void setVariable(int x, int y) {
		this.y = 80;
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.print(a.x + a.y);
	}
}