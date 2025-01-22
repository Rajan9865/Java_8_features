/**
 * 
 */
package gfgschool;

import java.util.stream.IntStream;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class FindSubstring1 {
	public static void main(String[] args) {
		String input = "abc";
		findAllSubstrings(input);
	}
	private static void findAllSubstrings(String input) {
		IntStream.range(0, input.length()).forEach(i -> IntStream.range(i + 1, input.length() + 1)
				.mapToObj(j -> input.subSequence(i, j)).forEach(System.out::println));
	}
}
