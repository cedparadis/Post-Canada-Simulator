package truck;

public class TestCase {

	public static void main(String[] args) {
		
		System.out.println("Test case for 1. Start a cargo");
		System.out.println("==============================");
		
		Truck truck = new Truck();
		
		truck.setDriverName("Cedric");
		truck.setUnloadedWeight(450, "kg");
		truck.setOriginalCity("Montreal");
		truck.setDestinationCity("Ottawa");
		
		System.out.println(truck.toString());

		System.out.println("\nTest case for 2. Load the truck with packages");
		System.out.println("================================================");
		truck.load(1222, 25, "lb" );
		truck.load(1111, 17, "lb");
		truck.load(1240, 25, "oz");
		truck.load(13423, 90, "lb");
		
		System.out.println("\nTest for the wrong package exception ");
		System.out.println("=======================================");
		
		truck.load(1238, 20, "lb");
		
		System.out.println("\nTest for the weight exception");
		System.out.println("==============================");
		
		truck.load(1222, 150, "lb");
		
		System.out.println("\nHard code the array to validate when you try to load more packages");
		System.out.println("====================================================================");
		
		for (int i = 0; i < 200; i++) {
			truck.load(111, 3, "lb");
		}
		
		
		System.out.println("\nTest case for 3. Unload a package");
		System.out.println("===================================");
		
		System.out.println("\nFor a specific package: ");
		System.out.println("==========================");
		
		truck.unload(1222);
		
		System.out.println("\nException if the package is not in the truck");
		System.out.println("==============================================");
		
		truck.unload(20);
		
		System.out.println("\nTest case for 4. The number of packages loaded");
		System.out.println("=================================================");
		
		System.out.println("Number of packages: " + truck.getNbOfPackages());
		
		System.out.println("\nTest case for 5. The gross income earned by shipping of the cargo ");
		System.out.println("====================================================================");
		
		System.out.println("The gross income is: " + truck.getGrossIncome() + "$.");
		
		System.out.println("\nTest case for 6. Weight the truck");
		System.out.println("====================================");
		
		System.out.println("The current weight of the truck is: " + Math.round(truck.getLoadedWeight()* 100.0)/ 100.0 + " lb and " + Math.round(truck.getLoadedWeightKG()* 100.0)/ 100.0 + " kg.");
		
		System.out.println("\nTest case for 6. Drive the truck to destination");
		System.out.println("==================================================");
		
		System.out.println("Driving...");
		System.out.println("Stopping to Tim Hortons...");
		System.out.println("Driving...");
		System.out.println("The delivery truck has arrived to " + truck.getDestinationCity());
		
		System.out.println("\n Test case for 2. Unloading the truck for the option all");
		System.out.println("==========================================================");
		truck.unloadAll();
		
		System.out.println("\n Test case for 0. To quit");
		System.out.println("===========================");
		System.out.println("Thank you for using our delivery software application!");
		System.exit(0);
		
	}

}
