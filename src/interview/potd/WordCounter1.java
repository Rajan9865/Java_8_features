/**
 * 
 */
package interview.potd;

import java.util.Arrays;

/**
 * interview.potd
 *@author Rajan kumar
 */
public class WordCounter1 {
	public static void main(String[] args) {
		String input=" coding is a the fun ";
		System.out.println("no of words "+countWords(input));
	}
	private static long countWords(String input) {
		return Arrays.stream(input.trim().split(" "))
				.filter(word->!word.isEmpty())
				.count();
	}
}
