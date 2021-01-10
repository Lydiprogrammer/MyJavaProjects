package litterstatistics;

/**
 * @author Lidia Nagy
 */

public class WasteMain {

	public static void main(String[] args) {

		WasteData uncategorizedWasteData1 = new UncategorizedWasteData(10, "Northern Hungary");
		System.out.println("1. uncategorized waste data: " + " weight: " + uncategorizedWasteData1.getMass() + "," +" region: " + uncategorizedWasteData1.getRegion() + "." );
		System.out.println();

		UncategorizedWasteData uncategorizedWasteData2 = new UncategorizedWasteData(150, "Central Hungary");
		System.out.println("2. uncategorized waste data: " +  " weight: " +  uncategorizedWasteData2.getMass() + "," + " region: " + uncategorizedWasteData2.getRegion() + ".");
		System.out.println();

		Recyclable recyclableWasteData1 = new RecyclableWasteData(20, "Central Transdanubia", "plastic");
		System.out.println("1. recyclable waste data: " +  " weight: "  + recyclableWasteData1.getMass() + "," + " material: " + recyclableWasteData1.getMaterial() + ".");
		System.out.println();

		RecyclableWasteData recyclableWasteData2 = new RecyclableWasteData(30, "Southern Transdanubia", "glass");
		System.out.println("2. recyclable waste data: " +  " weight: " + recyclableWasteData2.getMass() + "," + " region: " + recyclableWasteData2.getRegion() + "," + " material: " + recyclableWasteData2.getMaterial() + ".");
	}

}
