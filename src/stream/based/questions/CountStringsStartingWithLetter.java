/**
 * 
 */
package stream.based.questions;

import java.util.Arrays;
import java.util.List;

/**
 * @author deby7 11:47:09 pm 2023 Java_8_Features_examples TODO
 * Write a Java program to count the number of strings in a list that start with a specific letter using streams.
 */
public class CountStringsStartingWithLetter {
	public static void main(String[] args) {
		List<String>strings=Arrays.asList("apple", "banana", "cherry", "date", "fig","app");
		char targetLetter='a';
		long count=countStringsStartingWithLetter(strings, targetLetter);
		System.out.println("List of string ::"+strings);
		System.out.println("Number of strings starting with '" + targetLetter + "': " + count);
	}

	/**
	 * @param strings
	 * @param targetLetter
	 * @return
	 */
	private static long countStringsStartingWithLetter(List<String> strings, char targetLetter) {
		return strings.stream()
				.filter(str->str.startsWith(String.valueOf(targetLetter)))
				.count();
	}

}
