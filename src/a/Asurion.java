package a;

public class Asurion {

	public static void main(String[] args) {
		Client_Payment_Gateway person1 = new ATT();
	//	Client_Payment_Gateway person2 = new Sprint();
	//	Client_Payment_Gateway person3 = new Verizon();
		person1.enterVia_Paypal();
	//	person2.enterVia_Facebook();
	//	person3.enterVia_Gmail();
	}

}

class ATT implements Client_Payment_Gateway {
	
	public void enterVia_Paypal() {
		
	}
}

abstract class Sprint implements Client_Payment_Gateway {
	
	public void enterVia_Facebook() {
		
	}
}

abstract class Verizon implements Client_Payment_Gateway {
	public void enterVia_Gmail() {
		
	}
}

interface Client_Payment_Gateway {
	void enterVia_Paypal();
}
