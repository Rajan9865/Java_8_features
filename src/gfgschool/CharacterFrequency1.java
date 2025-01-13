/**
 * 
 */
package gfgschool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class CharacterFrequency1 {
	public static void main(String[] args) {
		String input = "aappqqss";
		findOccureneces(input);
	}

	private static void findOccureneces(String input) {
		Map<Character, Integer> charMap = new HashMap<>();
		for (char i : input.toCharArray()) {
			charMap.put(i, charMap.getOrDefault(i, 0) + 1);
		}
		List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(charMap.entrySet());
		sortedEntries.sort(Map.Entry.comparingByKey());
		System.out.println("frequesy count::");
		for (Map.Entry<Character, Integer> entry : sortedEntries) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
