package litterstatistics;

/**
 * @author Lidia Nagy
 */

public class Specification {
	
	/**
	  A non-profit organization collects statistics on illegal littering in Hungary by region, which we process with a program.
	 
	 In the program, a waste data (WasteData) interface represents a statistical data of the program:
	 	* int getMass() provides waste weight retrieval.
	 	* The purpose of the string getRegion() method is to extract the region in which data was recorded.
	 	* static void printWasteData(WasteData data) static method prints the region and mass of the data obtained as a parameter.
	 
	 The UncategorizedWasteData class implements the WasteData interface.
	 	* There is a mass field.
	 	* There is a region field.
	 	* And it implements the abstract methods of WasteData and has a corresponding constructor.
	
	 Another interface (Recyclable) represents recyclable objects.
	 	* It has a method called string getMaterial() that returns the recyclable object material such as paper, metal etc..
	 	* int getMass() provides the weight of the material.
	 
	 The RecyclableWasteData class represents registered recyclable waste.
	 	* It has a material field.
	 	* It implements the Recyclable's method and has a suitable constructor.
	 
	 The tasks:
	 	* Attach a main method (WasteMain) to the completed program,
	 	* in which we create 2 uncategorized and 2 recyclable waste data into 4 different variables.
	 	* Another purpose is to be each variables different in type.
	 */

}
