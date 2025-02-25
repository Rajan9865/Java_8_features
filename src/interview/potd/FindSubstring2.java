/**
 * 
 */
package interview.potd;

import java.util.stream.IntStream;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class FindSubstring2 {
	public static void main(String[] args) {
		String input = "abc";
		findAllSubstring(input);
	}

	/**
	 * @param input
	 */
	private static void findAllSubstring(String input) {
		IntStream.range(0, input.length()).forEach(i -> IntStream.range(i + 1, input.length() + 1)
				.mapToObj(j -> input.subSequence(i, j)).forEach(System.out::println));
	}

}
