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
public class MoveAllZeroestoEnd {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 0, 4, 3, 0, 5, 0 };
		int[] arr2 = { 0, 0, 0, 1, 2 };
		int[] arr3 = { 1, 2, 3, 4, 5 };
		int[] arr4 = { 0, 0, 0, 0 };
		printArray(arr1);
		moveAllZeroestoEnd(arr1);
		System.out.println();
		System.out.println("after move all zero to end");
		printArray(arr1);
	}

	/**
	 * @param arr1
	 */
	private static void printArray(int[] arr1) {
		for (int num : arr1) {
			System.out.print(num+" ");
//			System.out.println();
		}
	}

	/**
	 * @param arr1
	 */
	private static void moveAllZeroestoEnd(int[] arr1) {
		int nonZeroIndex=0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i]!=0) {
				// Swap non-zero element with the current non-zero index
				int temp=arr1[nonZeroIndex];
				arr1[nonZeroIndex]=arr1[i];
				arr1[i]=temp;
				nonZeroIndex++;
			}
		}
	}
}
