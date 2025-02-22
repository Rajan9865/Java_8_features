/**
 * 
 */
package gfg.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class PrintAnagramsTogether {
	public static void main(String[] args) {
		String[] arr = { "act", "god", "cat", "dog", "tac" };
		ArrayList<ArrayList<String>> result = groupofAnagram(arr);
		System.out.println(result);
	}

	/**
	 * @param arr
	 * @return
	 */
	private static ArrayList<ArrayList<String>> groupofAnagram(String[] arr) {
		Map<String, ArrayList<String>> map = new HashMap<>();
		for (String ch : arr) {
			char[] charArray = ch.toCharArray();
			Arrays.sort(charArray);
			String string = new String(charArray);
//			if (!map.containsKey(string)) {
//				map.put(string, new ArrayList<>());
//			}
//			map.get(string).add(ch);
			// and also we can use java 8 feature 
			map.computeIfAbsent(string, a->new ArrayList<>()).add(ch);
		}
		return new ArrayList<>(map.values());
	}
}
