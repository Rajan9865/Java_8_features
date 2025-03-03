/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class MinimumSizeSubarraySum {
	public static void main(String[] args) {
		int targer = 7;
		int[] num = { 2, 3, 1, 2, 4, 3 };
		System.out.println("minimum subarray : " + minSubArrayLen(num, targer));
	}

	private static int minSubArrayLen(int[] num, int targer) {
		int i = 0;
		int j = 0;
		int sum = 0;
		int minLength = Integer.MAX_VALUE;
		while (j < num.length) {
			sum += num[j];
			while (sum >= targer) {
				minLength = Math.min(minLength, j - i + 1);
				sum -= num[i];
				i++;
			}
			j++;
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
}
