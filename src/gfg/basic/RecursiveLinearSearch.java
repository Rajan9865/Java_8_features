/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class RecursiveLinearSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int target = 50;
		int index = 0;
		System.out.println("Element Found: " + searchRecursive(arr, index, target));
	}

	/**
	 * @param arr
	 * @param index
	 * @param target
	 * @return
	 */
	private static boolean searchRecursive(int[] arr, int index, int target) {
		if (index == arr.length) {
			return false;
		} else if (arr[index] == target) {
			return true;
		}
		return searchRecursive(arr, index + 1, target);
	}
}
