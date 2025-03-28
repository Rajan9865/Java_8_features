/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class SubarrayAverages {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
		int k = 5;

		double[] averages = findAverages(arr, k);
		printArray(averages);
	}

	/**
	 * @param averages
	 */
	private static void printArray(double[] averages) {
		for (double num : averages) {
			System.out.print(num + " ");
		}
	}

	private static double[] findAverages(int[] arr, int k) {
		double[] result = new double[arr.length - k + 1];
		double windoSum = 0;
		for (int i = 0; i < k; i++) {
			windoSum += arr[i];
		}
		result[0] = windoSum / k;
		for (int i = k; i < arr.length; i++) {
			windoSum += arr[i] - arr[i - k];
			result[i - k + 1] = windoSum / k;
		}
		return result;
	}
}
