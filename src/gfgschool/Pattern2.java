/**
 * 
 */
package gfgschool;

/**
 * gfgschool DelL
 */
public class Pattern2 {
	public static void main(String[] args) {
		int n = 5;
		printPattern(n);
	}

	/**
	 * @param n
	 */
	private static void printPattern(int n) {
		String pattern = "";
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				pattern += "*";
			}
			if (i != n) {
				pattern += " ";
			}
		}
		System.out.print(pattern);
	}

}
