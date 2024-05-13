/**
 * 
 */
package gfg.basic;

import java.util.Scanner;

/**
 * gfg.basic
 *DelL
 */
public class PowerOfTwo {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter the non negative integer:");
			long number=scanner.nextLong();
			boolean result=isPowerOfTwo(number);
			if (result) {
				System.out.println(number +" is power of 2");
			} else {
				System.out.println(number +" is not power of 2");
			}
		}
	}

	/**
	 * @param number
	 * @return
	 */
	private static boolean isPowerOfTwo(long number) {
		// check number is non-negative
		if (number<=0) {
			return false;
		}
		// for checking only one bit set binary representation
		return (number&(number-1))==0;
	}

}
