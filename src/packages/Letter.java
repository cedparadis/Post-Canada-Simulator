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
 *Class that represents a letter as a package with characteristics such as a tracking number, weight and shipping cost.
 */
public class Letter extends Package{

	/** Creates a letter object with various parameters.
	 * 
	 * @param track: represents the tracking number of the letter.
	 * @param weight: represents the weight of the letter.
	 * @param ounceOrPound: represents the measure unit. 
	 */
	public Letter (int track, double weight, String ounceOrPound) {
		super(track, weight, ounceOrPound);
	}
	/** Creates a letter object with a previous letter.
	 * 
	 * @param aLetter: represents a previous created letter.
	 */
	public Letter(Letter aLetter) {
		super(aLetter);
	}
	/** Sets the shipping cost of the letter.
	 * 
	 */
	public void setShippingCost() {
		
		shippingCost = toOunces(weight) * 0.05;
	}
	
	public String toString() {
		return "Package type: Letter"  + "\nTracking number: " + trackingNumber + "\nWeight: " + Math.round(weight*100.0)/100.0 + " " + ounceOrPound;
	}
	
	
}
