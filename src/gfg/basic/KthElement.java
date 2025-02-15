/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class KthElement {
	public static void main(String[] args) {
		int[] arr = { 3, 10, 7, 25, 15, 6 };
		int k = 2;

		System.out.println(k + "th Smallest: " + findKthSmallest(arr, k));
		System.out.println(k + "th Largest: " + findKthLargest(arr, k));
	}

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static int findKthLargest(int[] arr, int k) {
		return quickSort(arr, 0, arr.length - 1, arr.length - k);
	}

	/**
	 * @param arr
	 * @param i
	 * @param j
	 * @param k
	 * @return
	 */
	private static int quickSort(int[] arr, int low, int high, int k) {
		if (low <= high) {
			int pivotIndex = partition(arr, low, high);
			if (pivotIndex == k) {
				return arr[pivotIndex];
			} else if (pivotIndex > k) {
				return quickSort(arr, low, pivotIndex - 1, k);
			} else {
				return quickSort(arr, low, pivotIndex + 1, k);
			}
		}
		return -1;
	}

	/**
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static int findKthSmallest(int[] arr, int k) {
		return quickSort(arr, 0, arr.length - 1, k - 1);
	}
}
