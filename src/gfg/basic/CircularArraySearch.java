/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class CircularArraySearch {
	public static void main(String[] args) {
		int[] arr = { 30, 40, 50, 10, 20 };
		int target = 10;
		System.out.println("Element found at index: " + search(arr, target));
	}

	/**
	 * @param arr
	 * @param i
	 * @return
	 */
	private static int search(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
