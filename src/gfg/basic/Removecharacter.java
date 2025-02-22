/**
 * 
 */
package gfg.basic;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class Removecharacter {
	public static void main(String[] args) {
		String string1="ccomputer";
		String string2="catt";
		String result=revmove(string1,string2);
		System.out.println(result);
	}

	/**
	 * @param string1
	 * @param string2
	 * @return
	 */
	private static String revmove(String string1, String string2) {
		Set<Character>set=new HashSet<>();
		{
			for(char ch:string2.toCharArray()) {
				set.add(ch);
			}
		}
		StringBuilder stringBuilder=new StringBuilder();
		for(char ch:string1.toCharArray()) {
			if (!set.contains(ch)) {
				stringBuilder.append(ch);
			}
		}
		return stringBuilder.toString();
	}

}
