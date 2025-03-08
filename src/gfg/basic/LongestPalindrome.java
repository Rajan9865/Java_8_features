/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class LongestPalindrome {
	public static void main(String[] args) {
		String s = "forgeeksskeegfor";
		System.out.println(longestPalindrome(s));
	}

	private static String longestPalindrome(String s) {
		int maxLength = 1;
		int start = 0;
		// for odd length palindrome
		for (int i = 0; i < s.length(); i++) {
			int len = 1 + length(i - 1, i + 1, s);
			if (len > maxLength) {
				maxLength = len;
				start = i - len / 2;
			}
		}
		// for even length palindrome
		for (int i = 1; i < s.length(); i++) {
			int len = length(i - 1, i, s);
			if (len > maxLength) {
				maxLength = len;
				start = i - len / 2;
			}
		}
		return s.substring(start, start+ maxLength);
	}

	private static int length(int left, int right, String s) {
		int len = 0;
		while (left >= 0 && right < s.length()) {
			if (s.charAt(left) == s.charAt(right)) {
				len += 2;
				left--;
				right++;
			} else {
				break;
			}
		}
		return len;
	}
}
