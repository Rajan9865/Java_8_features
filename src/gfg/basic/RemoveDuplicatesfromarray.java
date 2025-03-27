/**
 * 
 */
package gfg.basic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class RemoveDuplicatesfromarray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 4, 2 };
		ArrayList<Integer> result = removeDuplicate(arr);
		System.out.println(result);
	}
	private static ArrayList<Integer> removeDuplicate(int[] arr) {
		Set<Integer>set=new LinkedHashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		return new ArrayList<>(set);
	}
}
