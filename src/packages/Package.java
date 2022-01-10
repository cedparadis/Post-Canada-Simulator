package packages;
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
 *This is a superclass.
 *Abstract class that represents a package with characteristics such as a tracking number, weight and shipping cost.
 */
public abstract class Package {

	protected int trackingNumber;
	protected double weight;
	protected double shippingCost;
	protected String ounceOrPound;
	
	/** Creates a package object.
	 * 
	 */
	public Package() {
		weight = 0;
		shippingCost = 0;
		
	}
	/** Creates a package object with parameters.
	 * 
	 * @param track: represents the tracking number of the package.
	 * @param weight: represents the weight of the package.
	 * @param ounceOrPound: represent the unit used for the weight.
	 */
	public Package (int track, double weight, String ounceOrPound) {
		this.ounceOrPound = ounceOrPound;
		trackingNumber= track;
		setWeight(weight);
	}
	/** Creates a package object with a previous package.
	 * 
	 * @param aPackage: represents a previous package already created.
	 */
	public Package(Package aPackage) {
		this.trackingNumber = aPackage.trackingNumber;
		this.weight = aPackage.weight;
		this.ounceOrPound = aPackage.ounceOrPound;
	}
	/** Gets the description of the package class.
	 *  @return a String that contains the description of the package.
	 */
	public String toString() {
		return "Package type: "  + "\nTracking number: " + trackingNumber + "\nWeight: " + weight + " " + ounceOrPound;
	}
	
	/** Sets the tracking number.
	 * 
	 * @param trackNum: represents the tracking number of the package.
	 */
	public void setTrackingNumber(int trackNum) {
		this.trackingNumber = trackNum;
	}
	
	/** Sets the weight of the package and converts to pounds if necessary.
	 * 
	 * @param weight: represents the weight of the package.
	 */
	public void setWeight(double weight) {
			if (ounceOrPound.equalsIgnoreCase("oz"))
		this.weight = toPounds(weight);
			else 
				this.weight = weight;
		
		
	}
	/** Sets the weight to pounds if the unit is in oz.
	 * 
	 * @param ounceOrPound: represents the measure unit used.
	 */
	public void setOunceOrPound(String ounceOrPound) {
		if (ounceOrPound.equalsIgnoreCase("oz")) {
			toPounds(weight);
		}
	}
	
	/** Sets the shipping cost of the package depending on the type of package.
	 * 
	 */
	public abstract void setShippingCost();
	
	/** Gets the cost of shipping the package.
	 * 
	 * @return a double that contains the shipping cost.
	 */
	public double getShippingCost() {
		return shippingCost;
	}
	
	/** Gets the tracking number of the package.
	 * 
	 * @return an int that contains the tracking number.
	 */
	public int getTrackingNumber() {
		return trackingNumber;
	}
	
	/** Gets the weight of the package.
	 * 
	 * @return a double that contains the weight.
	 */
	public double getWeight()
	{
		return weight;
	}
	
	/** Converts the weight from pounds to ounces.
	 * 
	 * @param weight: represents the weight of the packages.
	 * @return a double that contains the converted weight.
	 */
	public double toOunces(double weight) {
		return weight*16;
	}
	/** Converts the weight from ounces to pounds.
	 * 
	 * @param weight represents the weight of the packages.
	 * @return a double that contains the converted weight.
	 */
	public double toPounds(double weight) {
		return weight/16;
	}
	

	
}
