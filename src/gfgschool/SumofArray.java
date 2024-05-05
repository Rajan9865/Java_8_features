/**
 * 
 */
package gfgschool;

import java.util.Arrays;

/**
 * gfgschool
 *DelL
 */
public class SumofArray {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int result=sum(arr,n);
		System.out.println("sum of array :"+n+":"+result);
	}

	/**
	 * @param arr
	 * @param n
	 * @return
	 */
	private static int sum(int[] arr, int n) {
		/*
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
		*/
		return Arrays.stream(arr, 0, n).sum();
	}
}
