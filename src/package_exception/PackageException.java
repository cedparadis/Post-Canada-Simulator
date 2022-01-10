package package_exception;
//--------------------------------------
//Assignment #2
//Part: 1
//Written by: Cedric Paradis 40158491
//--------------------------------------
/** COMP 249.
 * Assignment #2.
 * Due Date: Wednesday, August 4th, 2021.
 * @author Cedric Paradis
 *
 *
 *<p>
 *Class that represents a custom exception for the package class.
 */
public class PackageException extends Exception{
/** Creates a PackageException object with a default message.
 * 
 */
	public PackageException() {
		super("This is a package exception");
	}
	
	/** Creates a PackageException object with a custom message.
	 * 
	 * @param message: represents the custom message.
	 */
	public PackageException(String message) {
		super(message);
	}
	
	
}
