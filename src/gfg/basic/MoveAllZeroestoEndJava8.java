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
public class MoveAllZeroestoEndJava8 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 0, 4, 3, 0, 5, 0 };
		int[] arr2 = { 0, 0, 0, 1, 2 };
		int[] arr3 = { 1, 2, 3, 4, 5 };
		int[] arr4 = { 0, 0, 0, 0 };
		printArray(arr1);
		moveAllZeroestoEnd(arr1);
		printArray(arr1);
	}

	/**
	 * @param arr1
	 */
	private static void moveAllZeroestoEnd(int[] arr1) {
		int[] nonZeroElement = Arrays.stream(arr1).filter(num -> num != 0).toArray();
		int nonZeroCount=nonZeroElement.length;
		System.arraycopy(nonZeroElement, 0, arr1, 0, nonZeroCount);
		Arrays.fill(arr1, nonZeroCount,arr1.length,0);
	}

	/**
	 * @param arr1
	 */
	private static void printArray(int[] arr1) {
		for(int num:arr1)
		{
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
