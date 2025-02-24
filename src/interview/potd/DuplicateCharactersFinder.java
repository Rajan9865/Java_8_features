/**
 * 
 */
package interview.potd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class DuplicateCharactersFinder {
	public static void main(String[] args) {
		String input = "programming";
		findDuplicateCharacters(input);
	}

	/**
	 * @param input
	 */
	private static void findDuplicateCharacters(String input) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		for (char ch : input.toCharArray()) {
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
		System.out.println("duplicate character:");
		charCountMap.forEach((ch, count) -> {
			if (count > 1) {
				System.out.println(ch + " " + count);
			}
		});
	}
}
