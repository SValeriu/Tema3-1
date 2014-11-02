package interfaces;

import exceptions.IssuesException;

/**
 * @author Ioan This is the interface
 */
public interface IConsumes {
	public void consumes() throws IssuesException;

	public void pollutes() throws IssuesException;

}
