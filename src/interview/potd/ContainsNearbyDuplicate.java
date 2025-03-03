/**
 * 
 */
package interview.potd;

import java.util.HashSet;
import java.util.Set;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class ContainsNearbyDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		int k = 3;
		System.out.println(containsNearbyDuplicate(arr, k));
	}

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static boolean containsNearbyDuplicate(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();
		int i = 0;
		int j = 0;
		while (j < arr.length) {
			if (Math.abs(i - j) > k) {
				set.remove(i);
				i++;
			}
			if (set.contains(j)) {
				return true;
			}
			set.add(arr[j]);
			j++;
		}
		return false;
	}

}
