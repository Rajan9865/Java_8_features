/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class Printfirstletter {
	public static void main(String[] args) {
		String s1="java is object oriented programming language";
		System.out.println("first latter print "+firstLetterPrinet(s1));
	}

	/**
	 * @param s1
	 * @return
	 */
	private static String firstLetterPrinet(String s1) {
		String[] split = s1.split(" ");
		StringBuilder stringBuilder=new StringBuilder();
		for(String word:split) {
			stringBuilder.append(word.charAt(0));
		}
		return stringBuilder.toString();
	}

}
