package litterstatistics;

/**
 * @author Lidia Nagy
 */

public interface WasteData {
	int getMass();
	String getRegion();

	static void printWasteData(WasteData data) {
		System.out.println(data.getMass());
		System.out.println(data.getRegion());
	}

}
