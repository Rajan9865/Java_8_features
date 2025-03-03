/**
 * 
 */
package interview.potd;

import java.text.DecimalFormat;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class FindAverages {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
		int k = 3;
		double[] result = findAverages(arr, k);

		printArray(result);
	}

	/**
	 * @param result
	 */
	private static void printArray(double[] result) {
		DecimalFormat df = new DecimalFormat("#.##");
		for (double ch : result) {
			System.out.print(df.format(ch) + " ");
		}
	}

	private static double[] findAverages(int[] arr, int k) {
		double[] result = new double[arr.length - k + 1];
		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		result[0] = sum / k;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i] - arr[i - k];
			result[i - k + 1] = sum / k;
		}
		return result;
	}
}
