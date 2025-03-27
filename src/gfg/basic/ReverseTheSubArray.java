/**
 * 
 */
package gfg.basic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class ReverseTheSubArray {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Collections.addAll(arr, 1, 2, 3, 4, 5, 6, 7);
		int l = 2;
		int r = 5;
		ArrayList<Integer> result = reverseSubArray(arr, l, r);
		System.out.println(result);
	}
	private static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r) {
		int start=l-1;
		int end=r-1;
		while (start<end) {
			int temp=arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end, temp);
			start++;
			end--;
		}
		return arr;
	}
}
