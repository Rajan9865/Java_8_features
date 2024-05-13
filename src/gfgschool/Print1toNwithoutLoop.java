/**
 * 
 */
package gfgschool;

import java.util.Scanner;

/**
 * gfgschool
 *DelL
 */
public class Print1toNwithoutLoop {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter the number to print number::");
			int num=scanner.nextInt();
			printNos(num);
		}
	}

	/**
	 * @param num
	 */
	private static void printNos(int num) {
		if (num>1) {
			printNos(num-1);
			System.out.print(num+" ");
		}
		else {
			System.out.print(num);
		}
	}

}
