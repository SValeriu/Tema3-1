package surse;

import exceptions.IssuesException;
import interfaces.IConsumes;

/**
 * @author Ioan This is the class for luxury cars
 */

public class Car_luxury extends Car implements IConsumes{

	public Car_luxury(String name) {
		super(name);
	}

	@Override
	public void consumes() throws IssuesException {
		System.out.println(getName() + " consuma putin combustibil");
		
	}

	@Override
	public void pollutes() throws IssuesException {
		System.out.println(getName() + " degajeaza putin CO2 in natura");
	}

	@Override
	public boolean inmatriculata(String Name) {
		return Name != null && (Name.startsWith("Registered"));
	}

}
