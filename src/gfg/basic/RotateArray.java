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
public class RotateArray {
	public static void main(String[] args) {
		int[] arr={1, 2, 3, 4, 5, 6, 7};
		int d=3;
		System.out.println("Original array ::");
		printArray(arr);
		rotateArray(arr,d);
	}

	/**
	 * @param arr
	 * @param d
	 */
	private static void rotateArray(int[] arr, int d) {
		int n=arr.length;
		d=d%n;
		// reverese first d element 
		reverse(arr,0,d-1);
		
		//then reverse the remainnin d element n-d
		reverse(arr,d,n-1);
		
		// revrese the entire elemet
		reverse(arr,0,n-1);
		
		printArray(arr);
		
	}

	/**
	 * @param arr
	 * @param i
	 * @param j
	 */
	private static void reverse(int[] arr, int start, int end) {
		while (start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		Arrays.stream(arr).forEach(num->System.out.print(num+" "));
		System.out.println();
	}
	

}
