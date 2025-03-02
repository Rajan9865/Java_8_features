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
public class FindDuplicates {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDuplicates(nums);
	}

	/**
	 * @param nums
	 */
	private static void findDuplicates(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int number : nums) {
			map.put(number, map.getOrDefault(number, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
