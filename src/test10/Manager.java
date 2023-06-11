package test10;

class Manager {
	public static int totalTask = 1;
	
	public void giveTask() {
		Employee e1 = new Employee();
		totalTask++;
	}
}