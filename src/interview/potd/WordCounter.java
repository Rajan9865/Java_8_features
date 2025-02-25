/**
 * 
 */
package interview.potd;

/**
 * interview.potd
 *@author Rajan kumar
 */
public class WordCounter {
	public static void main(String[] args) {
		String input=" coding is a the fun ";
		System.out.println("number of words  "+countWord(input));
	}
	private static int countWord(String input) {
		input=input.trim();
		int count=1 ;
		for(int i=0;i<input.length();i++)
		{
			if (input.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}
}
