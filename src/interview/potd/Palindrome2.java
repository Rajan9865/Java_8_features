/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class Palindrome2 {
	public static void main(String[] args) {
		String name = "madam";
		boolean palindrome = isPalindrome(name);
		System.out.println(palindrome);
	}

	/**
	 * @param name
	 * @return
	 */
	private static boolean isPalindrome(String name) {
		String reversedString = reversed(name);
		return name.equals(reversedString);
	}

	/**
	 * @param name
	 * @return
	 */
	private static String reversed(String name) {
		String reversedString="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reversedString+=name.charAt(i);
		}
		return reversedString;
	}

}
