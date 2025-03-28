/**
 * 
 */
package gfg.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class TripletFamily {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(findTriplet(arr));
	}

	private static boolean findTriplet(int[] arr) {
		Arrays.sort(arr);
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int target = arr[i] - arr[j];
				if (set.contains(target)) {
					return true;
				}
				set.add(arr[j]);
			}
		}
		return false;
	}
}
