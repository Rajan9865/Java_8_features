/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class Stockbuyandsell {
	public static void main(String[] args) {
//		int[] arr= {100, 180, 260, 310, 40, 535, 695};
		int[] arr= {4, 2, 2, 2, 4};
		int result=maximumProfit(arr);
		System.out.println(result);
	}
	private static int maximumProfit(int[] arr) {
		int finalResult=0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1]>arr[i]) {
				finalResult+=arr[i+1]-arr[i];
			}
		}
		return finalResult;
	}
}
