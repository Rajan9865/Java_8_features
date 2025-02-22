/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class QuickSortExample {
	public static void main(String[] args) {
		int[] arr = { 3, 10, 7, 25, 15, 6 };

		// Print the original array
		System.out.println("Original Array: ");
		printArray(arr);

		// Call quickSort to sort the array
		quickSort(arr, 0, arr.length - 1);

		// Print the sorted array
		System.out.println("Sorted Array: ");
		printArray(arr);
	}

	/**
	 * @param arr
	 * @param i
	 * @param j
	 */
	private static void quickSort(int[] arr, int low, int high) {
		if (low<high) {
			int pi=artition(arr, low, high);
			quickSort(arr, low, pi - 1);  // Sort left of pivot
            quickSort(arr, pi + 1, high); // Sort right of pivot
		}
	}

	/**
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private static int artition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if (arr[j]<=pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}

	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
