package surse;


/**
 * @author Ioan
 *	This is the abstract class for all the cars 
 */
public abstract class Car {

	/* The name of the car*/
	private String mName;
	
	/**
     * The default constructor that initializes the car with the given name
     * @param name  The name of the car
     */
    public Car(String name) {
        this.mName = name;
    }
	
    
    /**
     * Sets the name of the car
     * @param name  The name of the car
     */
    public void setName(String name) {
        this.mName = name;
    }

    /**
     * Gets the name of the car
     * @return  The name of the car
     */
    public String getName() {
        return mName;
    }
    
    
    /**
     * This method must be overwritten by all the subclasses
     *
     * @param Name    The name of the car
     * @return  <code>True</code> if the car is registered <code>False</code> if the car is not registered
     */
	public abstract boolean inmatriculata(String Name);

}
