/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 30, 40, 50 };
		System.out.println("Longest Increasing Subsequence Length: " + longestIncreasingSubsequence(arr));
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int longestIncreasingSubsequence(int[] arr) {
		int maxlen = 1;
		int currentLen = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				currentLen++;
				maxlen = Math.max(maxlen, currentLen);
			} else {
				currentLen = 1;
			}
		}
		return maxlen;
	}
}
