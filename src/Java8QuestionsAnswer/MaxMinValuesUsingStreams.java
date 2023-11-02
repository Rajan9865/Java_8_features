/**
 * 
 */
package Java8QuestionsAnswer;

import java.util.Arrays;
import java.util.List;

/**
 * @author deby7 10:11:11 pm 2023 Java_8_Features_examples TODO
 * Write a Java program to find the maximum and minimum values in a list of integers using streams.
 */
public class MaxMinValuesUsingStreams {
	public static void main(String[] args) {
		List<Integer>integers=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int max=findMaxvalue(integers);
		int min=findMinvalue(integers);
		
		System.out.println("Oiginal List of number::"+integers);
		System.out.println("Maximum value:"+max);
		System.out.println("Minimum Value::"+min);
	}

	/**
	 * @param integers
	 * @return
	 */
	private static int findMinvalue(List<Integer> integers) {
		return integers.stream()
			.mapToInt(Integer::intValue)
			.max()
			.orElse(0);
			
	}

	/**
	 * @param integers
	 * @return
	 */
	private static int findMaxvalue(List<Integer> integers) {
		return integers.stream()
				.mapToInt(Integer::intValue)
				.min()
				.orElse(0);
	}
}
