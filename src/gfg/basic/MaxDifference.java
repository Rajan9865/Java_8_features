/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class MaxDifference {
	public static void main(String[] args) {
		int[] arr = {10, 50, 20, 80, 30};
        System.out.println("Element with max diff: " + findMaxDiff(arr));
	}

	/**
	 * @param arr
	 * @return
	 */
	private static int findMaxDiff(int[] arr) {
		int maxDiff=Integer.MIN_VALUE;
		int index=-1;
		for(int i=0;i<arr.length-1;i++) {
			int diff=Math.abs(arr[i]-arr[i+1]);
			if (diff>maxDiff) {
				maxDiff=diff;
				index=i;
			}
		}
		return arr[index];
	}
}
