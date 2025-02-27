/**
 * 
 */
package interview.potd;

import java.util.ArrayList;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class IndexesofSubarraySum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 };
		int target = 11;
		System.out.println(subarraySum(arr, target));
	}

	/**
	 * @param arr
	 * @param target
	 * @return
	 */
	private static ArrayList<Integer> subarraySum(int[] arr, int target) {
		int left=0;
		int sum=0;
		ArrayList<Integer>result=new ArrayList<>();
		for(int right=0;right<arr.length;right++) {
			sum+=arr[right];
			while (sum>target&&left<=right) {
				sum-=arr[left++];
			}
			if (sum==target) {
				result.add(left+1);
				result.add(right+1);
				return result;
			}
		}
		result.add(-1);
		return result;
	}
}
