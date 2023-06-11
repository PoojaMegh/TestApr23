package test10;

public class Q2 {
	static int num;
	String name;
	double d;
	
	Q2(int num, double d, String name){
		Q2.num = num;
		this.d = d;
		this.name =name;
	}
	
	public static void main(String[] args) {
		Q2 q2 = new Q2(4, 5.7, "ABC");
		q2 = new Q2(3, 1.2, "XYZ");
		System.out.println(Q2.num + q2.d + q2.name);
	}
}
