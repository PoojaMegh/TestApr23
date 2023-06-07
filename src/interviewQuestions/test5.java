package interviewQuestions;

class Sweet {
	void price() {
		System.out.print("Sweet=$10");
	}
}

class Sugar extends Sweet {
	void price() {
		super.price();
		System.out.print("Sweet=$20");
	}
}
public class test5 {
	public static void main(String[] args) {
		Sugar su = new Sugar();
		su.price();
	}
}
