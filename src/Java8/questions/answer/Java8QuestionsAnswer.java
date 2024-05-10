/**
 * 
 */
package Java8.questions.answer;

import java.util.Arrays;
import java.util.List;

/**
 * @author deby7 7:49:10 am 2023 Java_8_Features_examples TODO
 * Write a Java program to calculate the average of a list of integers using streams
 */
public class Java8QuestionsAnswer {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		double average=calculateAverage(numbers);
		System.out.println("Average::"+average);
	}

	/**
	 * @param numbers
	 * @return
	 */
	private static double calculateAverage(List<Integer> numbers) {
		return numbers.stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0.0);
	}


}
