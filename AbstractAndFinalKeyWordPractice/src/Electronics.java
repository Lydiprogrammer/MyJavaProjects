/**
 * @author Lidia Nagy
 */

public class Electronics extends Product {

	/**
	 * In the case of electronic products, we store the number of warranty years.
	 */
	protected int warrantee;

	public Electronics(String id, String name, int warrantee) {
		super(id, name);
		this.warrantee = warrantee;
	}
	
	public Electronics(String id, String name) {
		super(id, name);
	}

/**
 * The description() method gives a short description to the product.
 * In the case of electronics, returns ELTX-<id> <name> (<warrantee>-year warranty)
 * Do not display the warranty section if there is no warranty.
 */
	@Override
	public String description() {
		if(warrantee == 0) {
			return "ELTX-" + id + " " + name;
		}else {
		return "ELTX-" + id + " " + name + " (" + warrantee + "-year warranty" + ")";
		}
	}

}
