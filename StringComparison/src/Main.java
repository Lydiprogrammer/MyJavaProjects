import java.util.HashSet;
import java.util.Set;

/**
 * @author Lidia Nagy
 */

/**
 * Short description of the task:
 * 
 * Create a Java program that contains a general solution for two String
 * properties. The result of the comparison is should always be an integer.
 * 
 * Example 1: The difference in length of the two Strings: "Javascript", "Java"
 * => 6 "a", "12345" => 4
 * 
 * Example 2: The number of characters common to the two strings (upper and
 * lower case is different). "Alma", "Körte" => 0 "Alma", "Alkar" => 3
 * 
 * Example 3: Levenshtein distance of the two Strings. This is the integer
 * number of steps it takes to change one String to the other String using
 * character swaps, deletes and inserts. "Apa", "Anya" => 2 "Alma", "Elme" => 2
 * 
 * 
 * Tasks: 1. Create a suitable functional interface according to the task
 * detailed above. Let's annotate it.
 * 
 * 2. Solve the problem in the first example: Implementing class Anonymous class
 * with lambda expression.
 *
 * 3. The problem in the second example is solved with a static method. Using
 * the reference of the generated method, create a corresponding lambda
 * expression.
 * 
 * 4. The generated expressions are tested in the main method, with String
 * pairs.
 * 
 * 
 * 
 * Bonus tasks:
 * 
 * Solve these problems in separate classes.
 * 
 * 1. Find a suitable built-in functional interface and use it to create lambda
 * expressions.
 * 
 * 2. Let's solve the third example.
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		String javaScript = "Javascript"; // 10
		String java = "Java"; // 4
		String a = "a"; // 1
		String numbers = "12345"; // 5
		String test1Or3 = "Almaa";
		String test2 = "Körte";
		String test4 = "Alkar";

		/**
		 * Testing an implementing class
		 */
		StringComparison stringLengthComparison = new StringLengthComparison();
		int firstResult = stringLengthComparison.comparison(javaScript, java);
		int secondResult = stringLengthComparison.comparison(numbers, a);
		System.out.println(
				"The difference between the lengths of " + javaScript + " and " + java + " is: " + firstResult);
		System.out.println("The difference between the lengths of " + numbers + " and " + a + " is: " + secondResult);

		/**
		 * Anonymous class implementation
		 */
		StringComparison stringLengthComparison2 = new StringComparison() {

			@Override
			public int comparison(String x, String y) {
				int lenOfX = x.length();
				int lenOfY = y.length();

				/**
				 * If the 2nd string is longer than the first string, a negative number will
				 * result. This is not advantageous in this case. Therefore, the absolute value
				 * should be called.
				 */
				int differenceByStrings = Math.abs(lenOfX - lenOfY);
				return differenceByStrings;
			}
		};

		System.out.println("First result of anonymous class: " + stringLengthComparison2.comparison(javaScript, java));
		System.out.println("Second result of anonymous class: " + stringLengthComparison2.comparison(numbers, a));

		/**
		 * Lambda expression implementation and testing
		 */
		StringComparison stringLengthComparison3 = (x, y) -> Math.abs(x.length() - y.length());
		System.out.println("The difference between the lengths of " + javaScript + " and " + java + " is: "
				+ stringLengthComparison3.comparison(javaScript, java));
		System.out.println("The difference between the lengths of " + numbers + " and " + a + " is: "
				+ stringLengthComparison3.comparison(numbers, a));

		/**
		 * Static method testing
		 */
		StringComparison commonCharacterCountComparison = Main::commonCharacters;
		System.out.println("The number of characters in common between the " + test1Or3 + " and " + test2 + " is: "
				+ commonCharacterCountComparison.comparison(test1Or3, test2));
		System.out.println("The number of characters in common between the " + test1Or3 + " and " + test4 + " is: "
				+ commonCharacterCountComparison.comparison(test1Or3, test4));

	}

	/**
	 * Implementation of an Implemeting class
	 */
	public static class StringLengthComparison implements StringComparison {
		@Override
		public int comparison(String x, String y) {
			int lenOfX = x.length();
			int lenOfY = y.length();
			int differenceByStrings = lenOfX - lenOfY;
			return differenceByStrings;
		}
	}

	/**
	 * 2. Example of static method
	 */
	public static int commonCharacters(String a, String b) {
		Set<Character> charactersFromA = new HashSet<>();
		Set<Character> charactersFromB = new HashSet<>();

		for (char character : a.toCharArray()) {
			charactersFromA.add(character);
		}

		for (char character : b.toCharArray()) {
			charactersFromB.add(character);
		}

		charactersFromA.retainAll(charactersFromB);
		return charactersFromA.size();
	}

}
