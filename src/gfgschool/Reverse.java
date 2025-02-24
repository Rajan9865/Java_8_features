/**
 * 
 */
package gfgschool;

import interview.potd.ReverseString1;

/**
 * gfgschool DelL
 */
public class Reverse {
	public static void main(String[] args) {
		String input="this is string problem";
		String resultString=reverseString1(input);
		System.out.println(resultString);

	}

	/**
	 * @param input
	 * @return
	 */
	private static String reverseString1(String input) {
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			reverse=reverse+input.charAt(i);
		}
		return reverse;
	}

}
