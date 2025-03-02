/**
 * 
 */
package revision;

import java.util.HashSet;
import java.util.Set;

/**
 * revision
 * 
 * @author Rajan kumar
 */
public class LongestConsecutive {
	public static int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums)
			set.add(num);

		int longest = 0;

		for (int num : nums) {
			if (!set.contains(num - 1)) {
				int count = 1, current = num;
				while (set.contains(current + 1)) {
					current++;
					count++;
				}
				longest = Math.max(longest, count);
			}
		}

		return longest;
	}

	public static void main(String[] args) {
		int[] nums = { 100, 5, 200, 1, 3, 2 };
		System.out.println(longestConsecutive(nums)); // Output: 4
	}
}
