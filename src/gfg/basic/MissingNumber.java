/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class MissingNumber {
	public static void main(String[] args) {
		int[] number = { 1, 2, 4, 5, 6 };
		System.out.println("missing number " + missingNumber(number, 6));
	}

	private static int missingNumber(int[] number, int n) {
		int toatalSum = (n * (n + 1) / 2);
		int actualSum = 0;
		for (int i : number) {
			actualSum += i;
		}
		return toatalSum - actualSum;
	}
}
