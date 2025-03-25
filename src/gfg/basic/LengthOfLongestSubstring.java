/**
 * 
 */
package gfg.basic;

import java.util.HashSet;
import java.util.Set;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		String s1 = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s1));
	}

	private static int lengthOfLongestSubstring(String s1) {
		HashSet<Character>set=new HashSet<>();
		int left=0;
		int maxLength=0;
		for(int right=0;right<s1.length();right++) {
			while (set.contains(s1.charAt(right))) {
				set.remove(s1.charAt(left));
				left++;
			}
			set.add(s1.charAt(right));
			 maxLength= Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}
}
