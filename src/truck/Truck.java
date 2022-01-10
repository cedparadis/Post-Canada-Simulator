package truck;
import package_exception.PackageException;
import packages.Letter;
import packages.Box;
import packages.Package;
import crate.WoodenCrate;
import crate.MetalCrate;
//--------------------------------------
//Assignment #2
//Part: 1
//Written by: Cedric Paradis 40158491
//--------------------------------------
/** COMP 249.
 * Assignment #2.
 * Due date : Wednesday August 4th, 2021.
 * @author Cedric Paradis
 * @version 4.18.0
 * <p>
 * This class represents a truck that will load different packages.
 * 
 */

public class Truck {

	private String driverName;
	private String originalCity;
	private String destinationCity;
	private double grossWeight;
	private double unloadedWeight;
	private int nbOfPackages;
	private double grossIncome;
	private Package[] packageArray;
	private String kiloOrPound;
	
	/** Creates a new Truck object.
	 * 
	 */

	public Truck() {
		driverName = "";
		originalCity = "";
		destinationCity = "";
		grossWeight = 0;
		unloadedWeight = 0;
		nbOfPackages = 0;
		grossIncome = 0;
		packageArray = new Package[200];
	}
/** Creates a new Truck object with specific parameters.
 * 
 * @param driverName : the name of the driver.
 * @param originalCity : the name of the departure city.
 * @param destinationCity : the name of the final city.
 * @param grossWeight : the total weight of the truck.
 * @param unloadedWeight : the weight of the truck with no packages.
 * @param nbOfPackages : the number of packages.
 * @param grossIncome : the income of the driver.
 * @param packageArray : all the packages in the truck.
 */
	public Truck (String driverName, String originalCity, String destinationCity, double grossWeight, double unloadedWeight, int nbOfPackages, double grossIncome, Package[] packageArray) {
		this.driverName = driverName;
		this.originalCity = originalCity;
		this.destinationCity = destinationCity;
		this.grossWeight = grossWeight;
		this.unloadedWeight = unloadedWeight;
		this.nbOfPackages = nbOfPackages;
		this.grossIncome = grossIncome;
		this.packageArray = packageArray;
	}
	
	/** Create a truck object by copying a previous truck object.
	 * 
	 * @param truck: the previous truck object.
	 */
	
	public Truck(Truck truck) {
		this.driverName = truck.driverName;
		this.originalCity = truck.originalCity;
		this.destinationCity = truck.destinationCity;
		this.grossWeight = truck.grossWeight;
		this.unloadedWeight = truck.unloadedWeight;
		this.nbOfPackages = truck.nbOfPackages;
		this.grossIncome = truck.grossIncome;
		this.packageArray = truck.packageArray;
	}
	/** Sets the weight automatically to pounds for kg. 
	 * 
	 * @param weight: a string that contains the measure unit used.
	 */
	public void setKiloOrPound(String weight) {
		if (weight.equalsIgnoreCase("kg")) { // converts everything to pound to have the same unit
			toPounds(unloadedWeight);
		}
	}
	
	/** Converts the weight into kilogram.
	 * 
	 * @param weight: a double that contains the weight of the truck.
	 * @return a double that has been converted into kilograms.
	 */
	
	public double toKilograms(double weight) {
		weight = weight /2.205;
		return weight;
	}
	
	/** Converts the weight into pounds.
	 * 
	 * @param weight: a double that contains the weight of the truck.
	 * @return a double that has been converted into pounds.
	 */
	public double toPounds(double weight) {
		return weight * 2.205; 
	}
	
	/** Sets the unloaded weight and converts to pounds if necessary.
	 * 
	 * @param weight: a double that represents the weight of the truck.
	 * @param unit: a String that represents the measure unit.
	 */
	public void setUnloadedWeight(double weight, String unit) {
		if (unit.equalsIgnoreCase("kg")) { // converts everything to pound to have the same unit
		unloadedWeight = toPounds(weight);
		defaultGrossWeight();
		}
		else 
			unloadedWeight = weight;
	} 
	
	/** Helping method to add the unloaded weight to the gross weight. 
	 * 
	 */
	private void defaultGrossWeight() {
		grossWeight = unloadedWeight;
	}
	
	/** Sets the name of the driver.
	 * 
	 * @param name: String that contains the driver's name.
	 */
	
	public void setDriverName(String name) {
		driverName= name;
	}
	/** Sets the name of the departure city.
	 * 
	 * @param city: String that represents the name of the departure city.
	 */
	public void setOriginalCity(String city) {
		originalCity = city;
	}
	/** Sets the name of the final city.
	 * 
	 * @param finalCity: String that represents the name of the final city.
	 */
	public void setDestinationCity(String finalCity) {
		destinationCity = finalCity;
	}
	
	/** Gets the unloaded weight.
	 * 
	 * @return double containing the unloaded weight.
	 */
	
	public double getUnloadedWeight() {
		return unloadedWeight;
	}
	
	/** Gets the loadedWeight.
	 * 
	 * @return a double that contains the total weight.
	 */
	public double getLoadedWeight() {
		return grossWeight;
	}
	
	/** Gets the weight from pounds into kilograms.
	 * 
	 * @return
	 */
	public double getLoadedWeightKG() {
		return toKilograms(grossWeight);
	}
	
	/** Gets the gross income of the driver.
	 * 
	 * @return a double that contains the total income.
	 */
	public double getGrossIncome() {
		return grossIncome;
	}
	
	/** Gets the driver's name.
	 * 
	 * @return a String that represents the driver name.
	 */
	public String getDriverName() {
		return driverName;
	}
	
	/** Gets the first city's name. 
	 * 
	 * @return a String that contains the first city name.
	 */
	public String getOriginalCity() {
		return originalCity;
	}
	
	/** Gets the final city's name.
	 * 
	 * @return a String that contains the final city name.
	 */
	public String getDestinationCity() {
		return destinationCity;
	}
	/** Gets all the packages stored in the truck.
	 * 
	 * @return a Package array that contains all the package objects in the truck.
	 */
	public Package[] getPackageArray() {
		return packageArray;
	}
	
	/** Gets the number of packages in the truck.
	 * 
	 * @return an int that contains the number of packages.
	 */
	public int getNbOfPackages() {
		return nbOfPackages;
	}
	
	/** Gets the information describing the truck.
	 *  @return a String containing all the descriptive information on the truck.
	 */
	public String toString() {
		return "The driver's name of the truck is " + driverName + ". The unloaded weight is " + Math.round(unloadedWeight * 100.0) / 100.0 + " lb and " + Math.round(toKilograms(unloadedWeight) * 100.0)/100.0 + " kg."+ ". The originating city is " 
	+ originalCity + ". The destination city is " + destinationCity + ".";
	}

	/** Method that loads a package into the truck. 
	 * 
	 * @param trackingNumber: an int that represents the tracking number of a package.
	 * @param weight: a double that represents the weight of the package.
	 * @param ounceOrPound: a String that represents the measure unit used. 
	 */
	public void load(int trackingNumber, double weight, String ounceOrPound) {
		try {
			if (trackingNumber % 10 != 0 && trackingNumber % 10 != 1 && trackingNumber % 10 != 2 && trackingNumber % 10 != 3) { // exception if we have a tracking number that doesn't have the right number
				throw new PackageException("The truck is not allowed to carry this package");
			}
		}
		catch (PackageException e) {
			System.out.println(e.getMessage());

		}
		if (trackingNumber % 10 ==0) { // last number is 0 for letter
			Letter aLetter = new Letter(trackingNumber, weight, ounceOrPound);
			try {
				if(ounceOrPound.equalsIgnoreCase("oz")) { // if condition for the ounce weight
				if(weight > 32) {
					throw new PackageException("Package is too heavy.");
				}
				}
				else if (ounceOrPound.equalsIgnoreCase("lb")) // if condition for the pound weight
				{
					if (weight > 2)
						throw new PackageException("Package is too heavy.");
				}
				try {
					for (int i =0; i< packageArray.length; i++) { // for loop to add the object of the array
						if (packageArray[i]== null) { // if it is empty then we can add it
							System.out.println("Loading...");
							packageArray[i] = new Letter(aLetter);
							nbOfPackages++;
							System.out.println(packageArray[i].toString());
							System.out.println("Package loaded successfully");
							break;
						}
						if (packageArray[packageArray.length-1] != null) // exception if there is no more space
							throw new PackageException("The truck is full");
					}

					
					aLetter.setOunceOrPound(ounceOrPound); // set the weight to pound if its in ounces
					grossWeight += aLetter.getWeight(); // add the weight to the truck

					aLetter.setShippingCost();
					System.out.println("c. Package shipping cost : ");
					System.out.println("Calculating shipping cost...");
					System.out.println("The shipping cost for this package is: " + aLetter.getShippingCost() + " $");
					grossIncome += aLetter.getShippingCost(); // add the income

				} // end of inner try block
				catch (PackageException e) {
					System.out.println(e.getMessage());
					
				}
			} // end of outer try block
			catch(PackageException e) {
				System.out.println(e.getMessage());
				System.out.println(aLetter.toString());
			}


		}
		else if(trackingNumber % 10 ==1) { // last number is 1 for letter
			Box aBox = new Box(trackingNumber, weight, ounceOrPound);
			try {
				if (ounceOrPound.equalsIgnoreCase("lb")) { // if condition for the pound weight
				if(weight > 40) {
					throw new PackageException("Package is too heavy.");
				}
				}
				else if (ounceOrPound.equalsIgnoreCase("oz")) { // if condition for the ounce weight
					if(weight > 640) {
						throw new PackageException("Package is too heavy.");
					}
				}
				try {
					for (int i =0; i< packageArray.length; i++) { // for loop to add the object of the array
						if (packageArray[i]== null) { // if it is empty then we can add it
							System.out.println("Loading...");
							packageArray[i] = new Box(aBox);
							nbOfPackages++;
							System.out.println(packageArray[i].toString());
							System.out.println("Package loaded successfully");
							break;
						}
						if (packageArray[packageArray.length-1] != null) // exception if there is no more space
							throw new PackageException("The truck is full");
					}
					aBox.setOunceOrPound(ounceOrPound); // set the weight to pound if its in ounces
					grossWeight += aBox.getWeight(); // add the weight to the truck

					aBox.setShippingCost();
					System.out.println("c. Package shipping cost : ");
					System.out.println("Calculating shipping cost...");
					System.out.println("The shipping cost for this package is: " + aBox.getShippingCost() + " $");
					grossIncome += aBox.getShippingCost();

				}
				catch (PackageException e) {
					System.out.println(e.getMessage());
					//System.out.println(aLetter.toString());
				}
			}
			catch(PackageException e) {
				System.out.println(e.getMessage());
				System.out.println(aBox.toString());
			}


		}
		/*
		 * Same explanation as the box and letter
		 */
		else if (trackingNumber % 10 == 2) {
			WoodenCrate aWoodenCrate = new WoodenCrate(trackingNumber, weight, ounceOrPound);
			try {
				if(ounceOrPound.equalsIgnoreCase("lb")) {
				if(weight > 80) {
					throw new PackageException("Package is too heavy.");
				}
				}
				else if (ounceOrPound.equalsIgnoreCase("oz"))
					if(weight > 1280)
						throw new PackageException("Package is too heavy.");
				try {
					for (int i =0; i< packageArray.length; i++) {
						if (packageArray[i]== null) {
							System.out.println("Loading...");
							packageArray[i] = new WoodenCrate(aWoodenCrate);
							nbOfPackages++;
							System.out.println(packageArray[i].toString());
							System.out.println("Package loaded successfully");
							break;
						}
						if (packageArray[packageArray.length-1] != null)
							throw new PackageException("The truck is full");
					}

					aWoodenCrate.setOunceOrPound(ounceOrPound);
					grossWeight += aWoodenCrate.getWeight();

					aWoodenCrate.setShippingCost();
					System.out.println("c. Package shipping cost : ");
					System.out.println("Calculating shipping cost...");
					System.out.println("The shipping cost for this package is: " + aWoodenCrate.getShippingCost() + " $");
					grossIncome += aWoodenCrate.getShippingCost();

				}
				catch (PackageException e) {
					System.out.println(e.getMessage());
					//System.out.println(aLetter.toString());
				}
			}
			catch(PackageException e) {
				System.out.println(e.getMessage());
				System.out.println(aWoodenCrate.toString());
			}


		}
		/*
		 * Same explanation as the box and letter
		 */
		else if (trackingNumber % 10 == 3) {
			MetalCrate aMetalCrate = new MetalCrate(trackingNumber, weight, ounceOrPound);
			try {
				if(ounceOrPound.equalsIgnoreCase("lb")) {
				if(weight > 100) {
					throw new PackageException("Package is too heavy.");
				}
				}
				else if(ounceOrPound.equalsIgnoreCase("oz")) {
					if (weight > 1600) {
						throw new PackageException("Package is too heavy.");
					}
				}
				try {
					for (int i =0; i< packageArray.length; i++) {
						if (packageArray[i]== null) {
							System.out.println("Loading...");
							packageArray[i] = new MetalCrate(aMetalCrate);
							nbOfPackages++;
							System.out.println(packageArray[i].toString());
							System.out.println("Package loaded successfully");
							break;
						}
						if (packageArray[packageArray.length-1] != null)
							throw new PackageException("The truck is full");
					}

					aMetalCrate.setOunceOrPound(ounceOrPound);
					grossWeight +=  aMetalCrate.getWeight();

					aMetalCrate.setShippingCost();
					System.out.println("c. Package shipping cost : ");
					System.out.println("Calculating shipping cost...");
					System.out.println("The shipping cost for this package is: " + aMetalCrate.getShippingCost() + " $");
					grossIncome += aMetalCrate.getShippingCost();

				}
				catch (PackageException e) {
					System.out.println(e.getMessage());
					//System.out.println(aLetter.toString());
				}
			}
			catch(PackageException e) {
				System.out.println(e.getMessage());
				System.out.println(aMetalCrate.toString());
			}


		}
		
		



	}
/** Unloads a specific packages from the truck.
 * 
 * @param trackNumber: an int that represents the tracking number of the package in the truck.
 */
	public void unload(int trackNumber) {

		try {
			for (int i =0; i < packageArray.length; i++) {

				if (packageArray[i] == null) // if it is empty we check for another index
					continue;
				else if (trackNumber != packageArray[i].getTrackingNumber() && packageArray[i] != packageArray[packageArray.length-1]) { // if it is not the same we check for another index
					continue;
				}
				else if (trackNumber == packageArray[i].getTrackingNumber()) { // if it is the same number
					System.out.println("Unloading...");
					System.out.println(packageArray[i].toString());
					grossWeight -= packageArray[i].getWeight();
					packageArray[i] = null; // delete the package 
					nbOfPackages--;
					System.out.println("Unloading complete");
					break;
				}
				else 
					throw new PackageException("This tracking number does not exist on the truck");
			}
		}
		catch (PackageException e) {
			System.out.println(e.getMessage());
		}

	}
	/** Unloads all the package from the truck
	 * 
	 */
	public void unloadAll() {
	
		System.out.println("Unloading...");
		for (int i = 0; i < packageArray.length; i++) { // loop to unload every packages
			if (packageArray[i] == null) { // if there is no package we just skip it
				continue;
			}
			grossWeight -= packageArray[i].getWeight(); 
			nbOfPackages--;
			System.out.println(packageArray[i].toString());
			packageArray[i] = null; // delete the package from the array
		}
		System.out.println("Unloading complete");
	}


}
