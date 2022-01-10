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
 *This is a subclass of the Package class.
 *Class that represents a box as a package with characteristics such as a tracking number, weight and shipping cost.
 */
public class Box extends Package{
/** Creates a box object with various parameters.
 * 
 * @param track: represents the tracking number of the box.
 * @param weight: represents the weight of the box.
 * @param ounceOrPound: represents the measure unit used.
 */
	public Box (int track, double weight, String ounceOrPound) {
		super(track, weight, ounceOrPound);
	}
	
	/** Creates a box object with a previous box. 
	 * 
	 * @param aBox: represents a previous created box.
	 */
	public Box(Box aBox) {
		super(aBox);
	}
	
	/** Sets the shipping cost of the box. 
	 * 
	 */
	public void setShippingCost() {
		if (ounceOrPound.equalsIgnoreCase("oz"))
		toPounds(weight);
		
		shippingCost = weight * 2;
	}
	
	public String toString() {
		return "Package type: Box"  + "\nTracking number: " + trackingNumber + "\nWeight: " + Math.round(weight*100.0)/100.0 + " " + ounceOrPound;
	}
	
}
