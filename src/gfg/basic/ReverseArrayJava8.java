/**
 * 
 */
package gfg.basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class ReverseArrayJava8 {
	public static void main(String[] args) {

		int[] arr1 = { 1, 4, 3, 2, 6, 5 };
		int[] arr2 = { 10, 20, 30, 40, 50 };
		int[] arr3 = { 1 };
		int[] arr4 = {};
		printArray(arr1);
		reverseArray(arr1);
		printArray(arr1);
	}

	/**
	 * @param arr1
	 */
	private static void reverseArray(int[] arr1) {
		List<Integer> collect = Arrays.stream(arr1)
		.boxed()
		.collect(Collectors.toList());
		Collections.reverse(collect);
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=collect.get(i);
		}
	}

	/**
	 * @param arr1
	 */
	private static void printArray(int[] arr1) {
		for (int num : arr1) {
			System.out.print(num+" ");
		}
		System.out.println();
	}

}
