/**
 * 
 */
package gfg.basic;

import java.util.stream.IntStream;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class LastindexofOneJava8 {
	public static void main(String[] args) {
		String test1 = "0010010";
		String test2 = "0000000";
		String test3 = "1";
		String test4 = "0";
		String test5 = "";
		int result=lastIndex(test2);
		System.out.println("last index "+result);
	}

	/**
	 * @param test1
	 * @return
	 */
	private static int lastIndex(String test1) {
		return IntStream.range(0, test1.length())
				.filter(i->test1.charAt(i)=='1')
				.reduce((first,second)->second)
				.orElse(-1);
	}

}
