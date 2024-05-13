/**
 * 
 */
package stream.based.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 11:37:55 pm 2023 Java_8_Features_examples TODO
 * Write a Java program to remove all duplicate elements from a list using streams.
 */
public class RemoveDuplicatesUsingStreams {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 7);
		List<Integer>distinctNumbers=RemoveDuplicates(numbers);
		System.out.println("original list::"+numbers);
		System.out.println("list with duplicate removed :"+distinctNumbers);
	}

	/**
	 * @param numbers
	 * @return
	 */
	private static List<Integer> RemoveDuplicates(List<Integer> numbers) {
		return numbers.stream()
				.distinct()
				.collect(Collectors.toList());
	}

}
