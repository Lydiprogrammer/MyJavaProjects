/**
 * @author Lidia Nagy
 */

import java.util.Arrays;

public class Food extends Product {

	/**
	 * Foods have their ingredients in a String array.
	 */
	protected String[] ingredients;

	public Food(String id, String name, String[] ingredients) {
		super(id, name);
		this.ingredients = ingredients;
	}
	
	public Food(String id, String name) {
		super(id, name);
	}

	/**
	 * The description() method gives a short description to the product.
	 * In the case of food, returns FOOD-<id> <name> (<ingredients>)
	 * If no component is specified, this section should not be displayed.
	 */
	@Override
	public String description() {
		if (ingredients == null) {
			return "FOOD-" + id + " " + name ;
		} else {
			return "FOOD-" + id + " " + name + " (" + Arrays.toString(ingredients) + ")";
		}
	}

}
