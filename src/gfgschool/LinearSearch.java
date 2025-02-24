/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class LinearSearch {
	public static void main(String[] args) {
		int[] input = { 5, 3, 8, 6, 7, 2 };
//		int target=6;
		int target = 16;
		int result = linearSearch(input, target);
		if (result == -1) {
			System.out.println("target " + target + " not found");
		} else {
			System.out.println("Target " + target + " found at index " + result);
		}
	}

	private static int linearSearch(int[] input, int target) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
