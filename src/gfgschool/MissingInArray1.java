/**
 * 
 */
package gfgschool;

import java.util.stream.IntStream;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class MissingInArray1 {
	public static void main(String[] args) {
		int[] number = { 1, 3, 2, 4, 6 };
		int result = missingNumber(number);
		System.out.println(result);
	}
	private static int missingNumber(int[] number) {
		int n = number.length + 1;
		long total = (long) n * (n + 1) / 2;
		long arraySum = IntStream.of(number).sum();
		return (int) (total - arraySum);
	}
}
