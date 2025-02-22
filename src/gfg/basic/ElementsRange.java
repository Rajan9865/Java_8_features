/**
 * 
 */
package gfg.basic;

import java.util.HashSet;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class ElementsRange {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 2, 7, 8, 3 };
		int a = 2;
		int b = 5;
		int length = arr.length;
		System.out.println(check_elements(length,arr,a,b));
	}

	/**
	 * @param length
	 * @param arr
	 * @param a
	 * @param b
	 * @return
	 */
	private static boolean check_elements(int length, int[] arr, int a, int b) {
		HashSet<Integer>hashSet=new HashSet<>();
		for(int i=0;i<length;i++) {
			hashSet.add(arr[i]);
		}
		for(int i=a;i<=b;i++) {
			if (!hashSet.contains(i)) {
				return false;
			}
		}
		return true;
	}
}
