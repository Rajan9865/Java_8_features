/**
 * 
 */
package gfgschool;

/**
 * gfgschool DelL
 */
public class Pattern1 {
	public static void main(String[] args) {
		int N = 5;
		printPattern(N);
	}

	/**
	 * @param n
	 */
	private static void printPattern(int N) {
		StringBuilder pattern = new StringBuilder(); // StringBuilder to build the pattern

		// Loop from 1 to N to build the pattern
		for (int i = 1; i <= N; i++) {
			// Append i asterisks to the StringBuilder
			for (int j = 1; j <= i; j++) {
				pattern.append("*");
			}
			// Append a space after each sequence of asterisks, except for the last one
			if (i != N) {
				pattern.append(" ");
			}
		}

		// Print the final pattern as a single line
		System.out.println(pattern.toString());
	}

}
