/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class ReverseArray {
	public static void main(String[] args) {
		int[] arr1 = {1, 4, 3, 2, 6, 5};
        int[] arr2 = {10, 20, 30, 40, 50};
        int[] arr3 = {1};
        int[] arr5 = {1, 2, 3, 4};
        int[] arr4 = {};
        printArray(arr5);
        reverseArray(arr5);
        printArray(arr5);

	}

	/**
	 * @param arr1
	 */
	private static void reverseArray(int[] arr1) {
		int start=0;
		int end=arr1.length-1;
		while (start<end) {
			int temp=arr1[start];
			arr1[start]=arr1[end];
			arr1[end]=temp;
			start++;
			end--;
		}
		
	}

	/**
	 * @param arr1
	 */
	private static void printArray(int[] arr1) {
		for (int num : arr1) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
