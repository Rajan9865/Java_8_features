/**
 * 
 */
package daily_practise_repeat_questions;

import java.util.Arrays;

/**
 * daily_practise_repeat_questions
 * 
 * @author Rajan kumar
 */
public class WordCounter2 {
	public static void main(String[] args) {
		String input = " coding is a fun ";
		System.out.println("word count is " + countWord(input));
		System.out.println("word count is " + countWord1(input));
		System.out.println("word count is " + countWord2(input));
		System.out.println("word count is " + countWord3(input));
	}

	/**
	 * @param input
	 * @return
	 */
	private static int countWord3(String input) {
		int coun = 1;
		input = input.trim();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				coun++;
			}
		}
		return coun++;
	}

	/**
	 * @param input
	 * @return
	 */
	private static int countWord2(String input) {
		input = input.trim();
		return (int) input.chars().filter(ch -> ch == ' ').count() + 1;
	}

	/**
	 * @param input
	 * @return
	 */
	private static int countWord1(String input) {
		return (int) Arrays.stream(input.trim().split(" ")).filter(word -> !word.isEmpty()).count();
	}

	/**
	 * @param input
	 * @return
	 */
	private static int countWord(String input) {
		input = input.trim();
		int count = 1;
		for (char ch : input.toCharArray()) {
			if (ch == ' ') {
				count++;
			}
		}
		return count;
	}

}
