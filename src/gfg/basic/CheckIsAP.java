/**
 * 
 */
package gfg.basic;

import java.util.Arrays;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class CheckIsAP {
	public static void main(String[] args) {
		int[] arr1 = { 0, 12, 4, 8 };
		System.out.println(checkIsAP(arr1));
	}

	/**
	 * @param arr1
	 * @return
	 */
	private static boolean checkIsAP(int[] arr1) {
		if (arr1.length<=1) {
			return true;
		}
		Arrays.sort(arr1);
		int cd=arr1[1]-arr1[0];
		for(int i=1;i<arr1.length-1;i++) {
			if (arr1[i+1]-arr1[i]!=cd) {
				return false;
			}
		}
		return true;
	}
}
