/**
 * 
 */
package sliding_window;

/**
 * sliding_window
 * 
 * @author Rajan kumar
 */
public class AveragesOfAllSubarray {
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

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static double[] findAverages(int[] arr, int k) {
		double[] result = new double[arr.length - k + 1];
		double windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		result[0] = windowSum / k;
		for (int i = k; i < arr.length; i++) {
			windowSum += arr[i] - arr[i - k];
			result[i - k + 1] = windowSum / k;
		}
		return result;
	}
}
