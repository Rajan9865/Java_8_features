/**
 * 
 */
package Lamdba.based.question;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author deby7 7:36:48 am 2023 Java_8_Features_examples TODO Write a Java
 *         program to implement a lambda expression to check if a given string
 *         is empty.
 */
public class StringIsEmptyCheck {
	public static void main(String[] args) {
		// questions 1
		StringCheck isEmpty = str -> str.isEmpty();
		String str1 = "Hello worlds";
		String str2 = "";
		System.out.println("Is str1 empty? " + isEmpty.check(str1));
		System.out.println("Is str2 empty? " + isEmpty.check(str2));

		/*
		 ******** Questions 2 ***** Write a Java program to implement a lambda expression to
		 * convert a list of strings to uppercase and lowercase.
		 */
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
		List<String> uppercaseStrings = convertStrings(strings, String::toUpperCase);
		List<String> lowercaseStrings = convertStrings(strings, String::toLowerCase);

		System.out.println("origanl list ::" + strings);
		System.out.println("upperlist ::" + uppercaseStrings);
		System.out.println("lowerlist ::" + lowercaseStrings);

	}

	/**
	 * @param strings
	 * @param object
	 * @return
	 */

	/*
	 * List<String> uppercaseStrings = convertStrings(strings, String::toUpperCase);
	 * List<String> lowercaseStrings = convertStrings(strings, String::toLowerCase)

	 * In this program, you use the convertStrings method twice, once to convert the
	 * strings to uppercase and once to convert them to lowercase, without
	 * duplicating the logic for iterating over the list, applying the
	 * transformation, and collecting the results.
	 */
	private static List<String> convertStrings(List<String> strings, Function<String, String> converter) {
		return strings.stream().map(converter).collect(Collectors.toList());

	}

	interface StringCheck {
		boolean check(String strs);
	}
}
