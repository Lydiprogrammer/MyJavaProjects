/**
 * @author Lidia Nagy A shop sells two types of goods: Food and Electronics.
 */

public abstract class Product {

	/**
	 * The goods (Product) have a unique identifier and a name.
	 */
	public String id;
	protected String name;

	public Product(String id, String name) {
		this.id = id;
		this.name = name;
		throwException();
	}

	/**
	 * The toString() method always returns the ID of the products.
	 */
	@Override
	public final String toString() {
		return id;
	}

	public abstract String description();

	/**
	 * The ID should consist of only 4 characters, we indicate by dropping a
	 * suitable exception in the corresponding place, if we do not specify 4
	 * characters.
	 */
	public void throwException() {
		if (id.length() > 4 || id.length() < 4) {
			throw new IllegalArgumentException("This is an exception.");
		}
	}

}
