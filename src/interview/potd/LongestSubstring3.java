/**
 * 
 */
package interview.potd;

import java.util.HashMap;
import java.util.Map;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class LongestSubstring3 {
	public static void main(String[] args) {
		String s = "abcdabcbb";
//		String s = "aaaa";
		System.out.println(longestSubs(s));
	}
	private static int longestSubs(String s) {
		int left=0;
		int maxLength=0;
		Map<Character, Integer>map=new HashMap<>();
		for(int right=0;right< s.length();right++) {
			char charAt = s.charAt(right);
			if (map.containsKey(charAt)&&map.get(charAt)>=left) {
				left=map.get(charAt)+1;
			}
			map.put(charAt, right);
			maxLength=Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}

}
