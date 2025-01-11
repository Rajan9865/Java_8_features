/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class ReverseString2 {
	public static void main(String[] args) {
		String name = "hellow";
		String reverse = reverseString1(name);
		System.out.println("reverse string " + reverse);
	}

	/**
	 * @param name
	 * @return
	 */
	private static String reverseString1(String name) {
		char[] array = name.toCharArray();
		int left = 0;
		int rignt = array.length - 1;
		while (left < rignt) {
			char temp = array[left];
			array[left] = array[rignt];
			array[rignt] = temp;
			left++;
			rignt--;
		}
		return new String(array);
	}
}
