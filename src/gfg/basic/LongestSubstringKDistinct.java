/**
 * 
 */
package gfg.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class LongestSubstringKDistinct {
	public static void main(String[] args) {
		String s = "araaci";
		int k = 2;
		System.out.println(
				"Longest substring with at most " + k + " distinct characters: " + longestSubstringWithKDistinct(s, k));
	}

	private static int longestSubstringWithKDistinct(String s, int k) {
		int left = 0;
		int maxlength = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int right = 0; right < s.length(); right++) {
			char charAt = s.charAt(right);
			map.put(charAt, map.getOrDefault(charAt, 0) + 1);
			while (map.size() > k) {
				char leftCharAt = s.charAt(left);
				map.put(leftCharAt, map.get(leftCharAt) - 1);
				if (map.get(leftCharAt) == 0) {
					map.remove(leftCharAt);
				}
				left++;
			}
			maxlength = Math.max(maxlength, right - left + 1);

		}
		return maxlength;
	}
}
