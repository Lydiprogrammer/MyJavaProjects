package practicesets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Lidia Nagy
 */

public class PracticeSets {
	
	public static void main(String[] args) {

		Set<String> englishSpeakers = new HashSet<>();
		englishSpeakers.add("Abigél");
		englishSpeakers.add("Béla");
		englishSpeakers.add("Cecília");
		englishSpeakers.add("Dénes");

		Set<String> spanishSpeakers = new TreeSet<>();
		spanishSpeakers.add("Abigél");
		spanishSpeakers.add("Béla");
		spanishSpeakers.add("Erika");

		Set<String> germanSpeakers = new LinkedHashSet<>();
		germanSpeakers.add("Béla");
		germanSpeakers.add("Erika");

		Set<String> englishOrGermanSpeakers = new TreeSet<>();
		englishOrGermanSpeakers.addAll(englishSpeakers);
		englishOrGermanSpeakers.addAll(germanSpeakers);

		for (String element : englishOrGermanSpeakers) {
			System.out.println(element);
		}

	}

}
