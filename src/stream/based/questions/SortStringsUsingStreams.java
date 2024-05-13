/**
 * 
 */
package stream.based.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 12:44:56 am 2023 Java_8_Features_examples TODO
 * Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
 */
public class SortStringsUsingStreams {
	public static void main(String[] args) {
		List<String>strings=Arrays.asList("banana", "cherry", "date", "apple", "fig");
		List<String>ascendingOrder=sortAscendingOrder(strings);
		List<String>descendingOrder=sortDescendingOrder(strings);
		System.out.println("List of original Strings list::"+strings);
		System.out.println("Sorted Ascending order list::"+ascendingOrder);
		System.out.println("Sorted Descending order list::"+descendingOrder);
	}

	/**
	 * @param strings
	 * @return
	 */
	private static List<String> sortDescendingOrder(List<String> strings) {
		Collections.sort(strings,(s1,s2)->s1.compareTo(s2));
		return strings;
	}

	/**
	 * @param strings
	 * @return
	 */
	private static List<String> sortAscendingOrder(List<String> strings) {
		Collections.sort(strings,(s1,s2)->s2.compareTo(s1));
		return strings;
		
	}

	/**
	 * @param strings
	 * @return
	 */

	/**
	 * @param strings
	 * @return
	 */
	/*
	private static List<String> sortDescendingOrder(List<String> strings) {
		return strings.stream()
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
	}
	*/
	
	/**
	 * @param strings
	 * @return
	 */
	
	/*
	private static List<String> sortAscendingOrder(List<String> strings) {
		return strings.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
	}
	*/
}
