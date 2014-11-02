package surse;

import exceptions.IssuesException;
import interfaces.IConsumes;

/**
 * @author Ioan This is the class for old cars
 */
public class Car_oldies extends Car implements IConsumes {

	public Car_oldies(String name) {
		super(name);
	}

	@Override
	public boolean inmatriculata(String Name) {
		return Name != null && (Name.startsWith("Unregistered"));
	}

	@Override
	public void consumes() throws IssuesException {
		System.out.println(getName() + " consuma mult combustibil");

	}

	@Override
	public void pollutes() throws IssuesException {
		System.out.println(getName() + " degajeaza mult CO2");

	}

}
