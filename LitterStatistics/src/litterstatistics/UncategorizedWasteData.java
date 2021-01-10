package litterstatistics;

/**
 * @author Lidia Nagy
 */

public class UncategorizedWasteData implements WasteData {
	
	protected int mass;
	protected String region;
	
	public UncategorizedWasteData(int mass, String region) {
		this.mass = mass;
		this.region = region;
	}

	@Override
	public int getMass() {
		return mass;
	}

	@Override
	public String getRegion() {
		return region;
	}
	
	

}
