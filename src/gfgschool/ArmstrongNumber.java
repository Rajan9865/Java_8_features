/**
 * 
 */
package gfgschool;

import java.util.Scanner;

/**
 * gfgschool DelL
 */
public class ArmstrongNumber {

	/**
	 * @param i
	 * @return
	 */
	static String armstrongNumber(int n) {
		int originalNUmber = n;
		int sumOfCube = 0;
		while (n > 0) {
			int digit = n % 10;
			sumOfCube += (digit * digit * digit);
			n /= 10;
		}
		if (sumOfCube == originalNUmber) {
			return "Yes";
		} else {
			return "No";

		}
	}

	public static void main(String[] args) {
//		System.out.println(armstrongNumber(371)); // Output: Yes
		/*
		 * int num=355; int digit=num/10; System.out.println(digit);
		 */
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the 3 digit number :");
			String input = scanner.nextLine().trim();
			int number = Integer.parseInt(input);
			System.out.println(number);
			System.out.println(input);

			if (input.length() == 3) {
				String result = armstrongNumber(number);
				System.out.println("Is it an Armstrong number? " + result);
			} else {
				System.out.println("Invalid input. Please enter a 3-digit number.");
			}
		}
	}
}
