/**
 * 
 */
package gfg.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class AlternativeSorting {
	public static void main(String[] args) {
		int[] arr = { 7, 1, 2, 3, 4, 5, 6 };
		ArrayList<Integer> result = alternateSort(arr);
		System.out.println(result);
	}

	private static ArrayList<Integer> alternateSort(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			list.add(arr[right--]);
			if (left <= right) {
				list.add(arr[left++]);
			}
		}
		return list;
	}

}
