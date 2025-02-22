/**
 * 
 */
package gfgschool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class CharacterFrequency {
	public static void main(String[] args) {
		String input = "programming";
		findOccurence(input);
	}

	private static void findOccurence(String input) {
//		char[] charArray = input.toCharArray();
//		Arrays.sort(charArray);
		Map<Character, Integer> charOccurence = new HashMap<>();
		for (char ch : input.toCharArray()) {
			charOccurence.put(ch, charOccurence.getOrDefault(ch, 0) + 1);
		}
		System.out.println("frequency count:");
		System.out.println(charOccurence);
		for (Map.Entry<Character, Integer> entry : charOccurence.entrySet()) {
			System.out.print(entry.getKey() + ": " + entry.getValue());
		}
	}
}
