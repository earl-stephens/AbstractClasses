package application;

public abstract class GameObject {
 
	/* abstract keyword prevents you from instantiating an
	 * object of this class
	 */
	
	public abstract void describe();
	/* this forces all the subclasses to have this method.
	 * The method itself is abstract and does nothing in this case.
	 */
}
