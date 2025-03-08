/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = { 3, 4, 7, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 1, 2, 5 };
		int n = 3;
		merge(nums1, m, nums2, n);
		printArray(nums1);
	}

	private static void printArray(int[] nums1) {
		for (int num : nums1) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}
		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}
	}

}
