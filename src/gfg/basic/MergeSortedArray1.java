/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class MergeSortedArray1 {
	public static void main(String[] args) {
		int[] nums1 = { 3, 4, 7 };
		int[] nums2 = { 1, 2, 5 };
		int[] merged = mergeSortedArray1(nums1, nums2);
		printmergedArray(merged);
	}
	private static void printmergedArray(int[] merged) {
		for (int num : merged) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	private static int[] mergeSortedArray1(int[] nums1, int[] nums2) {
		int[] merged = new int[nums1.length + nums2.length];
		int i = 0, j = 0, k = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] <= nums2[j]) {
				merged[k++] = nums1[i++];
			} else {
				merged[k++] = nums2[j++];
			}
		}
		while (i < nums1.length) {
			merged[k++] = nums1[i++];
		}
		while (j < nums2.length) {
			merged[k++] = nums2[j++];
		}
		return merged;
	}
}
