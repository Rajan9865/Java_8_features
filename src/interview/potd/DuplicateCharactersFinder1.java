/**
 * 
 */
package interview.potd;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * interview.potd
 *@author Rajan kumar
 */
public class DuplicateCharactersFinder1 {
	public static void main(String[] args) {
		String input="programming";
		findDuplicateCharacters(input);
	}

	private static void findDuplicateCharacters(String input) {
		Map<Character, Long> collect = input.chars().mapToObj(ch->(char)ch)
		.collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
		System.out.println("duplicate characters:");
		collect.entrySet().stream()
		.filter(entry->entry.getValue()>1)
		.forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
	}
}
