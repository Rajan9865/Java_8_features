/**
 * 
 */
package interview.potd;

import java.util.HashSet;
import java.util.Map;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class LongestSubstring1 {
	public static void main(String[] args) {
		String stiString = "abcdabcbb";
		System.out.println(longestSubs(stiString));
	}

	/**
	 * @param stiString
	 * @return
	 */
	private static int longestSubs(String stiString) {
		int left=0;
		int maxLength=0;
		HashSet<Character>set=new HashSet<>();
		for(int right=0;right<stiString.length();right++) {
			while (set.contains(stiString.charAt(right))) {
				set.remove(stiString.charAt(left));
				left++;
			}
			set.add(stiString.charAt(right));
			maxLength=Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}
}
