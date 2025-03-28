/**
 * 
 */
package gfg.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class SegregateEvenOdd {
	public static void main(String[] args) {
		int arr[] = { 12, 34, 45, 9, 8, 90, 3 };
		segregateEvenOdd(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.println();
		}
	}

	private static void segregateEvenOdd(int[] arr) {
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenList.add(arr[i]);
			} else {
				oddList.add(arr[i]);
			}
		}
		result.addAll(evenList);
		result.addAll(oddList);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = result.get(i);
		}
	}

}
