package nullvaluedischarge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author Lidia Nagy
 */

public class NullValueDischarge {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 799);
		map.put("cherry", null);
		map.put("pear", null);
		map.put("tomato", 699);
		map.put(null, 999);

		removeNulls(map);
		System.out.println(map);

	}

	/**
	 * Create a static removeNulls method of type void, which removes from the Map the null value elements, which received as a parameter.
	 */
	public static <K, V> void removeNulls(Map<K, V> map) {
		Set<Entry<K, V>> entrySet = map.entrySet();
		for (Iterator<Entry<K, V>> iterator = entrySet.iterator(); iterator.hasNext();) {
			Entry<K, V> entry = iterator.next();
			if (entry.getValue() == null) {
				iterator.remove();
			}
		}
	}

}
