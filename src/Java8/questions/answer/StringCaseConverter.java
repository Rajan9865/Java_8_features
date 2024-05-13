/**
 * 
 */
package Java8.questions.answer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 8:05:22 am 2023 Java_8_Features_examples TODO
 *  Write a Java program to convert a list of strings to uppercase or lowercase using streams.
 */
public class StringCaseConverter {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
		List<String>uppercaseStrings=convertupppercaseString(strings);
		List<String>lowercaseStrings=convertTolowercaseString(strings);
		System.out.println("Original String ::"+strings);
		System.out.println("Uppercase string :"+uppercaseStrings);
		System.out.println("lower case String::"+lowercaseStrings);
	}

	/**
	 * @param strings
	 * @return
	 */
	private static List<String> convertupppercaseString(List<String> strings) {
		return strings.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toList());
	}

	/**
	 * @param strings
	 * @return
	 */
	private static List<String> convertTolowercaseString(List<String> strings) {
		return strings.stream()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
	}
}
