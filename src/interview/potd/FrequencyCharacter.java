/**
 * 
 */
package interview.potd;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * interview.potd
 *@author Rajan kumar
 */
public class FrequencyCharacter {
	public static void main(String[] args) {
		String input="bbccddaa";
		frequency(input);
	}

	private static void frequency(String input) {
		Map<Character, Integer> frquencyMap = new HashMap<>();
		for (char ch : input.toCharArray()) {
			frquencyMap.put(ch, frquencyMap.getOrDefault(frquencyMap, 0) + 1);
		}
		System.out.println(frquencyMap);
	}
}
