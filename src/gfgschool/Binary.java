/**
 * 
 */
package gfgschool;

import java.util.Scanner;

/**
 * gfgschool DelL
 */
public class Binary {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the number :-");
			String number = scanner.nextLine().trim();
			boolean result = isBinary(number);
			int booleanInt = result ? 1 : 0;
			System.out.println("is the sequence Binary ? " + booleanInt);
		}

	}

	/**
	 * @param number
	 * @return
	 */
	private static boolean isBinary(String number) {
		for (char ch : number.toCharArray()) {
			if (ch != '0' && ch != '1') {
				return false;
			}
		}
		return true;
	}
}
