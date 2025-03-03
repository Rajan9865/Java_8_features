/**
 * 
 */
package revision;

import java.util.HashMap;
import java.util.Map;

/**
 * revision
 * 
 * @author Rajan kumar
 */
public class MostFrequentElement {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 2, 1, 4, 1, 3, 3, 3 };
		System.out.println(findMostFrequent(nums));
	}

	/**
	 * @param nums
	 * @return
	 */
	private static int findMostFrequent(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int max = 0;
		int mostmax = -1;
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			if (map.get(num) > max) {
				max = map.get(num);
				mostmax = num;
			}
		}
		return mostmax;
	}
}
