package reverseset;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Lidia Nagy
 */

public class ReverseSet {

	public static void main(String[] args) {

		Comparator<String> reverseComparator = new Comparator<String>() {
			/**
			 * Unique sorting: reverse ABC order
			 */
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};

		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		/**
		 * Specification a unique sorting in the constructor
		 */
		SortedSet<String> reverseSetOfInput = new TreeSet<String>(reverseComparator);
		while (counter != 5) {
			System.out.print("Enter something: ");
			String input = scanner.next();
			addOrRemoveInput(reverseSetOfInput, input);
			System.out.println(reverseSetOfInput);
			counter++;
		}

	}

	private static void addOrRemoveInput(Set<String> reverseSetOfInput, String input) {
		if (reverseSetOfInput.contains(input)) {
			reverseSetOfInput.remove(input);
		} else {
			reverseSetOfInput.add(input);
		}
	}

}
