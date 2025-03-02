/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class LongestSubstring2 {
	public static void main(String[] args) {
//		String s = "abcdabcbb";
		String s = "aaaa";
		System.out.println(longestSubs(s));
	}

	/**
	 * @param s
	 * @return
	 */
	private static int longestSubs(String s) {
		int left=0;
		int maxLength=0;
		int[] lastIndex=new int[256];
		for(int right=0;right<s.length();right++) {
			char charAt = s.charAt(right);
			if (lastIndex[charAt]>0) {
				left=Math.max(left, lastIndex[charAt]);
			}
			lastIndex[charAt]=right+1;
			maxLength=Math.max(maxLength, right-left+1);
		}
		return maxLength;
	}

}
