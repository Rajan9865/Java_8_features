/**
 * 
 */
package gfg.basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class Common_digits {
	public static void main(String[] args) {
		int[] num = { 131, 11, 48 };
		int[] result = commondigits(num);
		printArray(result);
	}
	/**
	 * @param result
	 */
	private static void printArray(int[] result) {
		for(int num:result) {
			System.out.print(num+" ");
		}
	}
	/**
	 * @param num
	 * @return
	 */
	private static int[] commondigits(int[] nums) {
		Set<Integer>set=new HashSet<>();
		for(int num:nums) {
			while (num>0) {
				set.add(num%10);
				num/=10;
			}
		}
		int[] result=new int[set.size()];
		int i=0;
		for(int num:set) {
			result[i++]=num;
		}
		Arrays.sort(result);
		return result;
	}
}
