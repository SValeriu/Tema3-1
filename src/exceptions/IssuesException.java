package exceptions;

/**
 * Created by John on 31/10/2014.
 *
 * This is the exception thrown by the {@link surse.Car} interface
 */
public class IssuesException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IssuesException(String message){
		super(message);
		
	}

}
