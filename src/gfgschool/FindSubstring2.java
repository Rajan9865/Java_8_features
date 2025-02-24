/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class FindSubstring2 {
	public static void main(String[] args) {
		String input = "abc";
		findAllSubstrings(input);
	}
	private static void findAllSubstrings(String input) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				System.out.println(input.substring(i, j));
			}
		}
	}
}
