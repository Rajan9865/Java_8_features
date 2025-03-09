/**
 * 
 */
package revision;

import java.util.HashMap;
import java.util.Map;

/**
 * revision
 *@author Rajan kumar
 */
public class WordFrequency {
	public static void main(String[] args) {
		String text = "apple banana apple orange banana apple";
        countWordFrequency(text);
	}

	/**
	 * @param text
	 */
	private static void countWordFrequency(String text) {
		Map<String, Integer>map=new HashMap<>();
		String[] split = text.split("\\s+");
		for(String wordString:split) {
			if (map.containsKey(wordString)) {
				map.put(wordString, map.get(wordString)+1);
			}else {
				map.put(wordString, 1);
			}
		}
		System.out.println(map);
	}
}
