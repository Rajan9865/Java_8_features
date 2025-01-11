/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class ReverseString3 {
	public static void main(String[] args) {
		String name="hellow";
		String reverse=reverseString1(name);
		System.out.println(reverse);
	}
	/**
	 * @param name2
	 * @return
	 */
	private static String reverseString1(String name2) {
		String reversedString="";
		for(int i=name2.length()-1;i>=0;i--)
		{
			reversedString+=name2.charAt(i);
		}return reversedString;
	}

}
