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
public class SecondLargestJava8 {
	public static void main(String[] args) {
		int[] test1 = { 10, 20, 30, 40 };
		int[] test2 = { 10, 10, 10 };
		int[] test3 = { 5 ,5};
		int[] test4 = { 20, 20, 10 };
		int[] test5 = { 3, 2, 1 };
		int[] test6 = {12 ,35 ,1 ,10 ,34 ,1};
		int result= getSecondLargest(test6);
		System.out.println(result);
	}

	/**
	 * @param test1
	 * @return
	 */
	private static int getSecondLargest(int[] test1) {
		if (test1==null||test1.length<2) {
			return -1;
		}
		return Arrays.stream(test1)
				.distinct()
				.boxed()
				.sorted((a,b)->b-a)
				.skip(1)
				.findFirst()
				.orElse(-1);
	}
}
