/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class PalindromeSubStringsCount {
	public static void main(String[] args) {
		String s = "abaab";
		System.out.println(palindromeSubStringsCount(s));
	}

	private static int palindromeSubStringsCount(String s) {
		int palindromecount = 0;
		for (int i = 0; i < s.length(); i++) {
			palindromecount += lenght(s, i, i);
			palindromecount += lenght(s, i, i + 1);
		}
		return palindromecount;
	}

	private static int lenght(String s, int left, int right) {
		int count = 0;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			if (right - left + 1 >= 2) {
				count++;
			}
			left--;
			right++;
		}
		return count;
	}
}
