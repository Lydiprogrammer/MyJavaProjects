/**
 * @author Lidia Nagy
 */

public class ProductMain{

	/**
	 * In the main method, create some products to make sure the program works correctly.
	 */
	public static void main(String[] args) {
		
		String[]ingredients = {"oat-flakes" ,"banana" ,"hazelnuts", "dark chocolate"};
		Food food = new Food("3333", "Oat Cookies", ingredients );
		System.out.println(food.description());
		
		System.out.println();
		
		Food food2 = new Food("5555", "apple pie");
		System.out.println(food2.description());
		
		System.out.println();
		
		Electronics electronics = new Electronics("1111", "iphone XR", 5);
		System.out.println(electronics.description());
		
		System.out.println();
		
		Electronics electronics2 = new Electronics("222", "laptop");
		System.out.println(electronics2.description());
		
	}
	

}
