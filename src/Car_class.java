public class Car_class implements Car {

	String brand, model;

	Car_class(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	@Override
	public void printManufacturer() {
		System.out.println(brand);

	}

	@Override
	public void printModel() {
		System.out.println(model);

	}

}
