/**
 * 
 */
package revision;

import java.util.HashMap;
import java.util.Map;

/**
 * revision
 *@author Rajan kumar
 */
public class FirstNonRepatingCharacter {
	public static void main(String[] args) {
		String string="aabbccdeff";
		System.out.println(firstNonRepatingCharacter(string));
	}

	/**
	 * @param string
	 * @return
	 */
	private static char firstNonRepatingCharacter(String string) {
		Map<Character, Integer>map=new HashMap<>();
		for(char ch:string.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
//		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
//			if (entry.getValue()==1) {
//				return entry.getKey();
//			}
//		}
//		return '\0';
		for(char ch:string.toCharArray()) {
			if (map.get(ch)==1) {
				return ch;
			}
		}
		return '\0';
	}

}
