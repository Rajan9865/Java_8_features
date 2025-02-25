/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 *@author Rajan kumar
 */
public class FindSubstring1 {
	public static void main(String[] args) {
		String input="abc";
		findAllSubstring(input);
	}

	/**
	 * @param input
	 */
	private static void findAllSubstring(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j <=input.length(); j++) {
				System.out.println(input.substring(i, j));
			}
		}
	}

}
