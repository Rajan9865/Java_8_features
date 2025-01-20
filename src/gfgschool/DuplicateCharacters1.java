/**
 * 
 */
package gfgschool;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class DuplicateCharacters1 {
	public static void main(String[] args) {
		String input = "programming";
		findDuplicate(input);
	}

	/**
	 * @param input
	 */
	private static void findDuplicate(String input) {
		 Map<Character, Long>countMap= input.chars().mapToObj(ch->(char)ch)
		 .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
		 System.out.println(countMap);
		 System.out.println("duplicate count::");
		 countMap.entrySet().stream()
		 .filter(entry->entry.getValue()>1)
		 .forEach(entry->System.out.println(entry.getKey()+": "+entry.getValue()));
	}

}
