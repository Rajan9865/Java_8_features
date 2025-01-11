/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 *
 */
public class ReverseString1 {
	public static void main(String[] args) {
		String s1="hellow";
		String reverse= reverseString1(s1);
		System.out.println("revrese string :"+reverse);
	}

	/**
	 * @param s1
	 * @return
	 */
	private static String reverseString1(String s1) {
		StringBuilder stringBuilder=new StringBuilder(s1);
		 return stringBuilder.reverse().toString();
	}

}
