/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class MissingInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2 };
		int result = missingArray(arr);
		System.out.println(result);
	}

	private static int missingArray(int[] arr) {
		int n = arr.length + 1;
		long totalSum = n * (n + 1) / 2;
		long arraySum = 0;
		for (int i = 0; i < arr.length; i++) {
			arraySum += arr[i];
		}
		return (int) (totalSum - arraySum);
	}
}
