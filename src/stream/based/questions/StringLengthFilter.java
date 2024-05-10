/**
 * 
 */
package stream.based.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 7:08:28 am 2023 Java_8_Features_examples TODO
 */
/*
 * Filter Strings by Length: Create a lambda expression to filter strings from a list based on their length.
 */
public class StringLengthFilter {
	public static void main(String[] args) {
		List<String>stringList=Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
		int desiredListLength=5;
		List<String> filteredList = stringList.stream()
				.filter(str -> str.length() >= desiredListLength)
				.collect(Collectors.toList());
		filteredList.forEach(System.out::println);
	}

}
