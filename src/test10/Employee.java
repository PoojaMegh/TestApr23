package test10;

public class Employee extends Manager {
	
	public static void main(String[] args) {
		Manager m = new Employee();
		m.giveTask();
		m.giveTask();
		m = new Employee();
		m.giveTask();
		System.out.println(totalTask);
	}
}
