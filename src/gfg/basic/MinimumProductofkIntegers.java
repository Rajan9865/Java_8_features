/**
 * 
 */
package gfg.basic;

import java.util.Arrays;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class MinimumProductofkIntegers {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 2;
		System.out.println(minProduct(arr, k));
	}

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static int minProduct(int[] arr, int k) {
		int product=1;
		Arrays.sort(arr);
		for(int i=0;i<k;i++) {
			product*=arr[i];
		}
		return product;
	}
}
