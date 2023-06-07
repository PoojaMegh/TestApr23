package a;

public class BankAccount {
	
	private static final double rs = 5000;
	
	public void deposite(double amt) {
	//	rs += amt;
	}
	
	public void withDraw(double amt) {
		if (rs > amt) {
	//		rs -= amt;
		}
	}
	
	public double getBalance() {
		return rs;
	}
	
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.deposite(5000);
		b1.withDraw(1000);
		b1 = new BankAccount();
		b1.withDraw(3000);
		b1 = new BankAccount();
	//	System.out.println(b1.rs);
	}

}
