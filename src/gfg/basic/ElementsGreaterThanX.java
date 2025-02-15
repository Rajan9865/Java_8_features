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
public class ElementsGreaterThanX {
	public static void main(String[] args) {
//		int[] arr = { 3, 10, 7, 25, 15, 6 };
		int[] arr = {};
		int x = 10;
		System.out.println("Element grather than " + x + " is " + findGreaterThan(arr, x));
	}

	/**
	 * @param arr
	 * @param x
	 * @return
	 */
	private static List<Integer> findGreaterThan(int[] arr, int x) {
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			if (num > x) {
				list.add(num);
			}
		}
		return list;
	}
}
