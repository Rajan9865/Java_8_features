/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 *@author Rajan kumar
 */
public class Palindrome1 {
	public static void main(String[] args) {
		String name="madamq";
		boolean isPalindrome=ispalindrome1(name);
		System.out.println(isPalindrome);
		
	}

	/**
	 * @param name
	 * @return
	 */
	private static boolean ispalindrome1(String name) {
		String reverString=palindrome1(name);
		return name.equalsIgnoreCase(reverString);
	}

	/**
	 * @param name
	 * @return
	 */
	private static String palindrome1(String name) {
		StringBuilder stringBuilder=new StringBuilder(name);
		return stringBuilder.reverse().toString();
	}

}
