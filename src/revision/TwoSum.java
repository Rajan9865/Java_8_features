/**
 * 
 */
package revision;

import java.util.HashMap;
import java.util.Map;

/**
 * revision
 *@author Rajan kumar
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {2, 17, 11, 15,7};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
	}

	/**
	 * @param nums
	 * @param target
	 * @return
	 */
	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int remainder=target-nums[i];
			if (map.containsKey(remainder)) {
				return new int[] {map.get(remainder),i};
			}
			map.put(nums[i], i);
		}
		return new int[] {-1,-1};
	}

}
