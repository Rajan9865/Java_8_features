/**
 * 
 */
package gfgschool;

import java.util.stream.IntStream;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class Stockbuyandsell1 {
	public static void main(String[] args) {
		int[] arr = { 100, 180, 260, 310, 40, 535, 695 };
//		  int[] arr = {4, 2, 2, 2, 4};  
		int result = maximumProfit(arr);
		System.out.println(result);
	}
	private static int maximumProfit(int[] arr) {
		return IntStream.range(0, arr.length - 1)
				.filter(i -> arr[i + 1] > arr[i])
				.map(i -> arr[i + 1] - arr[i]).sum();
	}
}
