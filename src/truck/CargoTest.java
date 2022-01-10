package truck;

import java.util.Scanner;
//--------------------------------------
//Assignment #2
//Part: 1
//Written by: Cedric Paradis 40158491
//--------------------------------------
/** Main method to load the truck with packages.
 * 
 * @author Cedric Paradis
 * 
 */
public class CargoTest {

	public static void main(String[] args) {
	
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		Truck testTruck = new Truck();
		
		while (true) {
			
			System.out.println("What would you like to do?" + "\n\t1.Start a cargo\n\t\ta.Driver Name\n\t\tb.Unload weight\n\t\tc.Originating City\n\t\td.Destination City");
			System.out.println("\t2. Load the truck with packages\n\t\ta.Package tracking number\n\t\tb.Package weight(oz;lb)\n\t\tc.Package Shipping Cost");
			System.out.println("\t3. Unload a package");
			System.out.println("\t4. The number of packages loaded");
			System.out.println("\t5. The gross income earned by shipping of the cargo");
			System.out.println("\t6. Weight the truck(after it has been completely loaded");
			System.out.println("\t7. Drive the truck to destination");
			System.out.println("\t0. To quit");
			System.out.println("Please enter your choice and press <Enter>: ");
			int choice = scanner.nextInt();
			
		switch (choice) {
		case 1: 
			
			System.out.println("a. Driver's name? ");
		scanner.nextLine();
			String name = scanner.nextLine();
		testTruck.setDriverName(name);
		System.out.println("b. The unloaded weight? (enter weight then \"kg\" or \"lb\") :");
		double unloadedWeight = scanner.nextDouble();
		String measure = scanner.next();
		testTruck.setUnloadedWeight(unloadedWeight, measure);
		System.out.println("c. Originating city? ");
		String originalCity = scanner.next();
		testTruck.setOriginalCity(originalCity);
		System.out.println("d. Destination city?");
		String destination = scanner.next();
		testTruck.setDestinationCity(destination);
		System.out.println(testTruck.toString());
		break;
		
		case 2:
			System.out.println("a. Package tracking number: ");
			int trackNumber = scanner.nextInt();
			System.out.println("b. Package weight (enter weight then \"oz\" or \"lb\"): ");
			double packWeight = scanner.nextDouble();
			String measure2 = scanner.next();
		    testTruck.load(trackNumber, packWeight, measure2);
		    
		    break;
		    
		case 3:
			while(true) {
			System.out.println("1. Unload a specific package.");
			System.out.println("2. Unload all the packages.");
			System.out.println("Enter your choice: ");
			int unloadChoice = scanner.nextInt();
			
			if (unloadChoice == 1) {
			System.out.println("Enter the tracking number of the package you want to unload: ");
			int unload = scanner.nextInt();
			testTruck.unload(unload);
			break;
			}
			else if (unloadChoice == 2) {
				testTruck.unloadAll();
				break;
			}
			else {
				System.out.println("Wrong choice, try again.");
			}
			}
				break;
		case 4:
			System.out.println("The number of packages loaded are: " + testTruck.getNbOfPackages() + " packages.");
			break;
			
		case 5:
			System.out.println("The gross income earned by shipping of the cargo is: " + testTruck.getGrossIncome() + " $.");
			break;
			
		case 6: 
			System.out.println("The current weight of the truck is: " + Math.round(testTruck.getLoadedWeight()* 100.0) /100.0 + " lb and " + Math.round(testTruck.getLoadedWeightKG() * 100.0)/100.0 + " kg.");
			break;
			
		case 7: 
			System.out.println("Driving...");
			System.out.println("Stopping to Tim Hortons...");
			System.out.println("Driving...");
			System.out.println("The delivery truck has arrived to " + testTruck.getDestinationCity());
			break;
			
		case 0:
			System.out.println("Thank you for using our delivery software application!");
			System.exit(0);
			break;
		}
		
		}
			
		
	}
	

}
