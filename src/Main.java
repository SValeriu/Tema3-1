public class Main {
	public static void main(String[] args) {
		Car_class ford = new Car_class("Ford", "Taurus");
		ford.printManufacturer();
		ford.printModel();
		
		Car_class merc = new Car_class("Mercedes", "CLA 45AMG");
		merc.printManufacturer();
		merc.printModel();
		
		Car_class bemer = new Car_class("BMW", "E46 M3 CSL");
		bemer.printManufacturer();
		bemer.printModel();
		

		System.out.println("Buna dimineata!");

		System.out.println("Buna Seara!");
		
		System.out.println("Noapte buna!");
		
		

	}
}
