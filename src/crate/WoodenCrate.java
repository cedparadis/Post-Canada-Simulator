package crate;
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
 **This is a subclass of the Crate class.
 *Class that represents a wooden crate as a crate package with characteristics such as a tracking number, weight and shipping cost.
 */
public class WoodenCrate extends Crate{
	
	/** Creates a wooden crate object with various parameters.
	 * 
	 * @param track: represents the tracking number of the wooden crate.
	 * @param weight: represents the weight of the wooden crate.
	 * @param ounceOrPound: represents the measure unit used.
	 */
	public WoodenCrate(int track, double weight, String ounceOrPound) {
		super(track, weight, ounceOrPound);
	}
	/** Creates a wooden crate object with a previous wooden crate.
	 * 
	 * @param wooden: represents a previous created wooden crate.
	 */
	public WoodenCrate(WoodenCrate wooden) {
		super(wooden);
	}
	
	/** Sets the shipping cost of the wooden crate.
	 * 
	 */
	public void setShippingCost() {
		if (ounceOrPound.equalsIgnoreCase("oz"))
		toPounds(weight);
		
		shippingCost = weight * 2.5;
	}
	
	public String toString() {
		return "Package type: Wooden crate"  + "\nTracking number: " + trackingNumber + "\nWeight: " + Math.round(weight*100.0)/100.0 + " " + ounceOrPound;
	}
}
