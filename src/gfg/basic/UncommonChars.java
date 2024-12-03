/**
 * 
 */
package gfg.basic;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class UncommonChars {
	public static void main(String[] args) {
		String A = "raja";
		String B = "raja";
		String resultString = unComman(A, B);
		System.out.println("unComman characters :" + resultString);
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	private static String unComman(String a, String b) {
		if (a.equals(b)) {
			return "-1";
		}
		Set<Character> setA = new HashSet<>();
		Set<Character> setB = new HashSet<>();
		for (char character : a.toCharArray()) {
			setA.add(character);
		}
		for (char character : b.toCharArray()) {
			setB.add(character);
		}
		Set<Character> unccomman = new TreeSet<>();
		for (char character : setA) {
			if (!setB.contains(character)) {
				unccomman.add(character);
			}
		}
		for (char character : setB) {
			if (!setA.contains(character)) {
				unccomman.add(character);
			}
		}
		if (unccomman.isEmpty()) {
			return "-1";
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (char character : unccomman) {
			stringBuilder.append(character);
		}
		return stringBuilder.toString();
	}

}
