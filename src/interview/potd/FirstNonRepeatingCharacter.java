/**
 * 
 */
package interview.potd;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String input = "apple";
		System.out.println(" non-repeating character: " + firstUniqChar(input));
	}

	private static char firstUniqChar(String input) {
		Map<Character, Long> charCountMap = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(charCountMap);
		return input.chars().mapToObj(ch -> (char) ch).filter(ch -> charCountMap.get(ch) == 1).findFirst().orElse(' ');
	}
}
