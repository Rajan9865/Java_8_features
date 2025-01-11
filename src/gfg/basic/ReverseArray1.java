/**
 * 
 */
package gfg.basic;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class ReverseArray1 {
	public static void main(String[] args) {
	int[] number= {1,2,4,5,6};
	 int[] reverseArr= reverseArray(number); 
	 System.out.println(Arrays.toString(reverseArr));
	}

	/**
	 * @param number
	 * @return
	 */
	private static int[] reverseArray(int[] number) {
		return IntStream.range(0, number.length)
				.map(i->number[number.length-1-i])
				.toArray();
	}
}
