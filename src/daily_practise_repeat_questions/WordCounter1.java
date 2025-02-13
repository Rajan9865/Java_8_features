/**
 * 
 */
package daily_practise_repeat_questions;

import java.util.Iterator;

/**
 * daily_practise_repeat_questions
 *@author @Rajan kumar
 */
public class WordCounter1 {
	public static void main(String[] args) {
		String input=" coding is a fun ";
		System.out.println("word count is : "+wordCounter(input));
	}

	/**
	 * @param input
	 * @return
	 */
	private static int wordCounter(String input) {
		input=input.trim();
		int count=1;
		for(int i=0;i<input.length();i++)
		{
			if (input.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}

}
