/**
 * 
 */
package gfgschool;

import java.util.stream.IntStream;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class BinaryString2 {
	public static void main(String[] args) {
		String string="10001001";
		 int result= binarySubstring(string.length(),string);
		 System.out.println("total substrin: "+result);
	}

	private static int binarySubstring(int length, String string) {
		long count=string.chars()
				.filter(ch->ch=='1')
				.count();
		return (int)(count*(count-1))/2;
	}

}
