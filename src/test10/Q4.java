package test10;

public class Q4 {
	
	static int cnt = 3;
	
	Q4(){
		this(cnt);
		cnt++;
	}
	
	Q4(int cnt2){
		cnt++;
	}

	public static void main(String[] args) {
		Q4 q4 = new Q4();
		q4 = new Q4(4);
		System.out.println(q4.cnt);
	}
}
