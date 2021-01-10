package litterstatistics;

/**
 * @author Lidia Nagy
 *
 * It represents registered recyclable waste.
 */

public class RecyclableWasteData extends UncategorizedWasteData implements Recyclable {

	String material;

	public RecyclableWasteData(int mass, String region, String material) {
		super(mass, region);
		this.material = material;
	}

	@Override
	public String getMaterial() {
		return material;
	}

}
