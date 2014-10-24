public class Main {
	public static void main(String[] args) {
		Car_class ford = new Car_class("Ford", "Taurus");
		ford.printManufacturer();
		ford.printModel();
		
		Car_class merc = new Car_class("Mercedes", "CLA 45AMG");
		merc.printManufacturer();
		merc.printModel();
	}
}
