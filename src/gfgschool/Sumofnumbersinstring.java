/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class Sumofnumbersinstring {
	public static void main(String[] args) {
		String input = "1raj23ajn6";
		long sum = sumOfDigit(input);
		System.out.println(sum);
	}

	/**
	 * @param input
	 * @return
	 */
	private static long sumOfDigit(String input) {
		long sum = 0;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char charAt = input.charAt(i);
			if (Character.isDigit(charAt)) {
				stringBuilder.append(charAt);
			} else {
				if (stringBuilder.length() > 0) {
					sum += Long.parseLong(stringBuilder.toString());
					stringBuilder.setLength(0);
				}
			}
		}
		if (stringBuilder.length() > 0) {
			sum += Long.parseLong(stringBuilder.toString());
		}
		return sum;
	}
}
