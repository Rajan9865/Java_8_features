/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 * 
 * @author Rajan kumar
 */
public class VowelConsCounter {
	public static void main(String[] args) {
		String input = "helloWorlds";
		int[] counts = countVowelsAndConsonants(input);
		System.out.println("input character "+input);
		System.out.println("vowels character count "+counts[0]);
		System.out.println("constants character count "+counts[1]);

	}

	/**
	 * @param input
	 * @return
	 */
	private static int[] countVowelsAndConsonants(String input) {
		int vowels = 0;
		int constants = 0;
		String string = input.toLowerCase();
		for (char ch : string.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if (isVowel(ch)) {
					vowels++;
				} else {
					constants++;
				}
			}
		}
		return new int[] {vowels,constants};
	}

	/**
	 * @param ch
	 * @return
	 */
	private static boolean isVowel(char ch) {
		return "aeiou".indexOf(ch)!=-1;
	}
}
