/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class MaxSumSubarray {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		System.out.println(maxSumSubarray(arr, k));
	}

	/**
	 * @param arr
	 * @param k
	 * @return
	 */
	private static int maxSumSubarray(int[] arr, int k) {
		int sum=0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		int maxSum=sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i]-arr[i-k];
			maxSum=Math.max(maxSum,sum);
		}
		return maxSum;
	}
}
