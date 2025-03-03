/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class MaxVowels {
	public static void main(String[] args) {
		String s = "aeiou";
		int k = 3;

		int result = maxVowels(s, k);
		System.out.println(result);
	}

	private static int maxVowels(String s, int k) {
		int i = 0;
		int j = 0;
		int maxVowel = 0;
		int count = 0;
		while (j < s.length()) {
			if (isVowel(s.charAt(j))) {
				count++;
			}
			if (j - i + 1 == k) {
				maxVowel = Math.max(maxVowel, count);
				if (isVowel(s.charAt(i))) {
					count--;
				}
				i++;
			}
			j++;
		}
		return maxVowel;
	}

	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
