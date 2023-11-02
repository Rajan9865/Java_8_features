/**
 * 
 */
package StreamBasedQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 10:35:56 pm 2023 Java_8_Features_examples TODO
 * Write a Java program to find the second smallest and largest elements in a list of integers using streams.
 */
public class SecondSmallestLargestUsingStreams {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
		int secondSmallest=findSecondSmallest(numbers);
		int secondLargest=findSecondLargest(numbers);
		System.out.println("Original list number :"+numbers);
		System.out.println("2nd smallest number :"+secondSmallest);
		System.out.println("2nd Largest number ::"+secondLargest);
	}

	/**
	 * @param numbers
	 * @return
	 */
	private static int findSecondLargest(List<Integer> numbers) {
		List<Integer>sortestDistinct=numbers.stream()
				.distinct()
				.sorted((a,b)->b-a)
				.collect(Collectors.toList());
		if (sortestDistinct.size()<2) {
			return -1;
		}
		return sortestDistinct.get(2);
	}

	/**
	 * @param numbers
	 * @return
	 */
	private static int findSecondSmallest(List<Integer> numbers) {
		List<Integer>sortestDistinct=numbers.stream()
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		if (sortestDistinct.size()<2) {
			return -1;
		}
		return sortestDistinct.get(2);
	}

}
