/**
 * 
 */
package gfg.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class LongestSubstringWithKVowels {
	public static void main(String[] args) {
		String s = "aebcdeeoiu";
		int k = 2;
		System.out.println("Longest substring with at most " + k + " vowels: " + longestSubstringWithKVowels(s, k));
	}

	private static String longestSubstringWithKVowels(String s, int k) {
		Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		int l = 0;
		int r = 0;
		int vowelCount = 0;
		int maxLength = 0;
		int startIndex = 0;
		while (r < s.length()) {
			if (vowels.contains(s.charAt(r))) {
				vowelCount++;
			}
			while (vowelCount > k) {
				if (vowels.contains(s.charAt(l))) {
					vowelCount--;
				}
				l++;
			}
			if (r - l + 1 > maxLength) {
				maxLength = r - l + 1;
				startIndex = l;
			}
			r++;
		}
		return s.substring(startIndex, startIndex + maxLength);
	}
}
