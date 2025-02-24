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
public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String input="aabbccc";
//		nonRepeatingCharacter(input);
		char result= nonRepeatingCharacter(input);
		System.out.println(result);
	}

	/**
	 * @param input
	 */
	private static char nonRepeatingCharacter(String input) {
		Map<Character, Long> collect = input.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
//		System.out.println(collect);
		return input.chars().mapToObj(ch -> (char) ch).filter(c -> collect.get(c) == 1)
		.findFirst()
		.orElse('$');
				
//		.ifPresent(ch -> System.out.println("non repating character: " + ch));
		
	}
}
