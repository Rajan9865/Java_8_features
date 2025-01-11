/**
 * 
 */
package interview.prepration;

import java.util.Arrays;

/**
 * interview.prepration
 * 
 * @author Rajan kumar
 */
public class ReverseArray1 {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 6, 7 };
		int[] reverse = reverseArray(number);
		System.out.println(Arrays.toString(reverse));
	}

	/**
	 * @param number
	 * @return
	 */
	private static int[] reverseArray(int[] number) {
		int left=0;
		int right=number.length-1;
		while (left<right) {
			int temp=number[left];
			number[left]=number[right];
			number[right]=temp;
			left++;
			right--;
		}
		return number;
	}
}
