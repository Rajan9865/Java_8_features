/**
 * 
 */
package gfgschool;

import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class TwoSumProblem1 {
	public static void main(String[] args) {
		int[] input= {1,2,3,5,7};
		int target=10;
		boolean result=twoSum(input,target);
		System.out.println(result);
	}
	private static boolean twoSum(int[] input, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		return IntStream.of(input).anyMatch(num -> {
			int difference = target - num;
			if (map.containsKey(difference)) {
				return true;
			}
			map.put(num, 1);
			return false;
		});
	}
}
