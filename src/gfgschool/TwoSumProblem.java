/**
 * 
 */
package gfgschool;

import java.util.HashMap;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class TwoSumProblem {
	public static void main(String[] args) {
		int[] input= {2, 7, 11, 15,-1};
		int target=1;
		boolean result=twoSum(input,target);
		System.out.println(result);
	}

	/**
	 * @param input
	 * @param target
	 * @return
	 */
	private static boolean twoSum(int[] input, int target) {
		HashMap<Integer, Integer> hashMap=new HashMap<>();
		for(int i=0;i<input.length;i++)
		{
			int difference=target-input[i];
			if (hashMap.containsKey(difference)) {
				return true;
			}
			hashMap.put(input[i], 1);
		}
		return false;
	}
}
