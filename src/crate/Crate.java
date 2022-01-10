package crate;
import packages.Package;
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
 *Abstract Class that represents a crate as a package with characteristics such as a tracking number, weight and shipping cost.
 */
public abstract class Crate extends Package{
	/** Creates a crate object with various parameters.
	 * 
	 * @param track: represents the tracking number of the crate.
	 * @param weight: represents the weight of the crate.
	 * @param ounceOrPound: represents the measure unit used.
	 */
	public Crate (int track, double weight, String ounceOrPound) {
		super(track, weight, ounceOrPound);
	}
	
	/** Creates a crate object with a previous crate.
	 * 
	 * @param aCrate: represents a previous created crate.
	 */
	public Crate(Crate aCrate) {
		super(aCrate);
	}
	
}
