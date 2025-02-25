/**
 * 
 */
package revision;

import java.util.HashSet;
import java.util.Set;

/**
 * revision
 *@author Rajan kumar
 */
public class ArrayIntersection {
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(findIntersection(nums1, nums2)); 
	}

	/**
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	private static Set<Integer> findIntersection(int[] nums1, int[] nums2) {
		Set<Integer>set=new HashSet<>();
		Set<Integer>resultIntegers=new HashSet<>();
		for(int num:nums1) {
			set.add(num);
		}
		for(int num:nums2) {
			if (set.contains(num)) {
				resultIntegers.add(num);
			}
		}
		return resultIntegers;
	}
}
