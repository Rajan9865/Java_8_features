/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class Countpairsum {
	public static void main(String[] args) {
		int x = 10;
		int arr1[] = { 1, 3, 5, 7 };
		int arr2[] = { 2, 3, 5, 8 };

		System.out.println("Number of pairs: " + countPairs(arr1, arr2, x));
	}

	/**
	 * @param arr1
	 * @param arr2
	 * @param x
	 * @return
	 */
	private static int countPairs(int[] arr1, int[] arr2, int x) {
		int i = 0;
		int j = arr2.length - 1;
		int count = 0;
		while (i < arr1.length && j >= 0) {
			int sum = arr1[i] + arr2[j];
			if (sum == x) {
				count++;
				i++;
				j--;
			} else if (sum < x) {
				i++;
			} else {
				j--;
			}
		}
		return count;
	}

}
