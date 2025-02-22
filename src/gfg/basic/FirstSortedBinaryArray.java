/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class FirstSortedBinaryArray {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
		System.out.println("First index of 1 in arr1: " + firstIndex(arr));
	}
  
	/**
	 * @param arr
	 * @return
	 */
	private static long firstIndex(int[] arr) {
		int low=0;
		int hight=arr.length-1;
		long result=-1;
		while (low<=hight) {
			int mid=(low+hight)/2;
			if (arr[mid]==1) {
				result=mid;
				hight=mid-1;
			}else {
				low=mid+1;
			}
		}
		return result;
	}

}
