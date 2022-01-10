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
 *This is a subclass of the Crate class.
 *Class that represents a metal crate as a crate package with characteristics such as a tracking number, weight and shipping cost.
 */
public class MetalCrate extends Crate{

	/** Creates a metal crate object with various parameters.
	 * 
	 * @param track: represents the tracking number of the metal crate.
	 * @param weight: represents the weight of the metal crate.
	 * @param ounceOrPound: represents the measure unit used.
	 */
	public MetalCrate(int track, double weight, String ounceOrPound) {
		super(track, weight, ounceOrPound);
	}
	/** Creates a metal crate object with a previous metal crate.
	 * 
	 * @param metal: represents a previous created metal crate.
	 */
	public MetalCrate(MetalCrate metal) {
		super(metal);
	}
	
	/** Sets the shipping cost of the metal crate.
	 * 
	 */
	public void setShippingCost() {
		if (ounceOrPound.equalsIgnoreCase("oz"))
		toPounds(weight);
		
		shippingCost = weight * 3;
	}
	
	public String toString() {
		return "Package type: Metal crate"  + "\nTracking number: " + trackingNumber + "\nWeight: " + Math.round(weight*100.0)/100.0 + " " + ounceOrPound;
	}
	
}
