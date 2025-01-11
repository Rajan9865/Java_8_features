/**
 * 
 */
package gfg.basic;

import java.util.Arrays;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class SortaString {
	public static void main(String[] args) {
		String s1="abcref";
		System.out.println("sorted string : "+sortString(s1));
	}

	/**
	 * @param s1
	 * @return
	 */
	private static String sortString(String s1) {
		char[] arr=s1.toCharArray();
		Arrays.sort(arr);
		return new String(arr) ;
	}

}
