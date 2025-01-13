/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class ClosestNumber {
	public static void main(String[] args) {
//		int n = 10, m = 3;
		int n = -15, m = 6;
		System.out.println(closestNumber(n, m));
//		System.out.println(-15 + 3);
	}

	/**
	 * @param number
	 * @param number1
	 * @return
	 */
	static int closestNumber(int n, int m) {
		if (n % m == 0)return n;
		int result = 0;
		Boolean isNegative = (n < 0) ? true : false;
		int prev_closest = Math.abs(m) * Math.abs((n / m));
		int next_closest = (Math.abs((prev_closest / m)) + 1) * Math.abs(m);
		if (Math.abs(Math.abs(n) - prev_closest) == Math.abs(Math.abs(n) - next_closest)) {
			result = (Math.abs(prev_closest) > Math.abs(next_closest)) ? prev_closest : next_closest;
		} else if (Math.abs(Math.abs(n) - prev_closest) > Math.abs(Math.abs(n) - next_closest)) {
			result = next_closest;
		} else {
			result = prev_closest;
		}
		return Boolean.TRUE.equals((isNegative)) ? (result * -1) : result;
	}
}
