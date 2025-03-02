/**
 * 
 */
package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * revision
 * 
 * @author Rajan kumar
 */
public class GroupAnagrams {
	public static void main(String[] args) {
		String[] words = { "bat", "tab", "cat", "tac", "rat" };
		System.out.println(groupAnagrams(words));
	}

	/**
	 * @param words
	 * @return
	 */
	private static List<List<String>> groupAnagrams(String[] words) {
		Map<String, List<String>>map=new HashMap<>();
		for(String charString:words) {
			char[] charArray = charString.toCharArray();
			Arrays.sort(charArray);
			String string=new String(charArray);
			if (!map.containsKey(string)) {
				map.put(string	, new ArrayList<>());
			}
			map.get(string).add(charString);
		}
		return new ArrayList<>(map.values());
	}
}
