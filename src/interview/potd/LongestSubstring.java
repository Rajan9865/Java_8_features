/**
 * 
 */
package interview.potd;

import java.util.ArrayList;
import java.util.List;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class LongestSubstring {
	public static void main(String[] args) {
		String stiString = "abcdabcbb";
		System.out.println(longestSubs(stiString));
	}
	private static int longestSubs(String stiString) {
		int left=0;
		int right=0;
		int maxLength=0;				
		List<Character>list=new ArrayList<>();
		while (right<stiString.length()) {
			if (!list.contains(stiString.charAt(right))) {
				list.add(stiString.charAt(right));
				right++;
				maxLength=Math.max(maxLength, list.size());
			}else {
				list.remove(Character.valueOf(stiString.charAt(left)));
				left++;
			}
		}
		return maxLength;
	}
}
