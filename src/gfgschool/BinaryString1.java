/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class BinaryString1 {
	public static void main(String[] args) {
		String str1 = "0100011";
        int result1 = binarySubstring(str1.length(), str1);
        System.out.println("Result for : " + result1);
	}

	/**
	 * @param length
	 * @param str1
	 * @return
	 */
	private static int binarySubstring(int length, String str1) {
		int count = 0;
		for (int ch : str1.toCharArray()) {
			if (ch == '1') {
				count++;
			}
		}
		return (count * (count - 1)) / 2;
	}
}
