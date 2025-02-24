/**
 * 
 */
package gfgschool;

import java.awt.image.RescaleOp;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class TwoSumProblem2Leetcode {
	public static void main(String[] args) {
		int[] input= {1,2,3,5,7};
		int target=10;
		int[] result=twoSum(input,target);
		if (result!=null) {
			System.out.println("indicate :"+result[0]+","+result[1]);
		} else {
			System.out.println("not foud");
		}
	}

	/**
	 * @param input
	 * @param target
	 * @return
	 */
	private static int[] twoSum(int[] input, int target) {
		Map<Integer, Integer>map=new HashMap<>();
		return IntStream.range(0,input.length)
		.mapToObj(i->
		{
			int num=input[i];
			int complement=target-num;
			if (map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
						}
			map.put(num, i);
			return null;
		})
		.filter(result->result!=null)
		.findFirst()
		.orElse(null);
	}
}