/**
 * 
 */
package gfg.basic;

import java.util.Arrays;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class BinaryArraySortingJava8 {
	public static void main(String[] args) {
		int[] arr= {0,1,0,1,0,0,1,1,1,0,0,0,1,0,1,1};
		System.out.println("oringnal array :");
		printArray(arr);
		binSort(arr);
		System.out.println("sorted arrays");
		printArray(arr);
		
	}

	/**
	 * @param arr
	 */
	private static void binSort(int[] arr) {
		long count = Arrays.stream(arr).filter(num->num==0).count();
		System.out.println(count);
		Arrays.fill(arr, 0, (int) count, 0);
		Arrays.fill(arr, (int) count, arr.length, 1);
	}

	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		Arrays.stream(arr).forEach(num->System.out.print(num+ " "));
		System.out.println();
	}

}
