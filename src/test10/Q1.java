package test10;

public class Q1 {
	static String company;
	static String tech;
	
	Q1(String company){
		this.company = company;
	}
	
	public static void main(String[] args) {
		Q1 q1 = new Q1("technocredits");
	}
	
	static void display() {
	//	System.out.println(new Q1().tech);
	//	System.out.println(new Q1().company);
	}
}
