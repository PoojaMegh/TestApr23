package test10;

public class Q3 {
	String city = "ABC";
	String village = "XYZ";
	
	Q3(String place){
		this.city = place;
	}
	
	public static void main(String[] args) {
		Q3 q3 = new Q3("PQR");
		q3 = new Q3("MNO");
		System.out.println(new Q3("JKL").city + " " + new Q3("GHI").village);
	}
	
	void updateCity() {
		System.out.println(city);
	}
	
	void updateVillage() {
		System.out.println(village);
	}
}
