package concatenationoflists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lidia Nagy
 */

public class ConcatenationOfLists {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Python");
		list1.add("Scala");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Ruby");
		list2.add("C#");
		
		System.out.println(listConcat(list1, list2));
		System.out.println(listConcat(list2, list1));
		System.out.println(list1);
		System.out.println(list2);
		
	}
	
	public static <E> List<E> listConcat(List<E> firstList, List<E> secondList){
		List<E> concatenation = new ArrayList<>();
		concatenation.addAll(firstList);
		concatenation.addAll(secondList);
		return concatenation;
	}

}
