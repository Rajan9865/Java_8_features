/**
 * 
 */
package gfgschool;

import java.util.Scanner;

/**
 * gfgschool DelL
 */
public class CountOfElements {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("entere the no of element in the arrays: ");
			int n = scanner.nextInt();
			System.out.println("Enter the elements of the array (sorted in non-decreasing order):");
			int[] arr = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println("enter the target element :");
			int x = scanner.nextInt();
			int result = countOfElements(arr, n, x);
			System.out.println("Number of element <=" + x + ": " + result);
		}

	}

	/**
	 * @param arr
	 * @param n
	 * @param x
	 * @return int[] arr = {1, 3, 5, 7, 9, 11, 13}; // Sorted array
	 */
	private static int countOfElements(int[] arr, int n, int x) {
		int low = 0;
		int high = n - 1;
		int result = 0;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] <= x) {
				result = mid + 1;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return result;
	}

}
