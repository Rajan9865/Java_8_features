/**
 * 
 */
package stream.based.questions;

import java.util.Arrays;
import java.util.List;

/**
 * @author deby7 11:31:44 pm 2023 Java_8_Features_examples TODO
 * Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
 */
public class SumEvenOddNumbers {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17);
		int sumEven=calculateSumEven(numbers);
		int sumOdd=calculateSumOdd(numbers);
		
		System.out.println("list of numbers:"+numbers);
		System.out.println("Sum of even numbers::"+sumEven);
		System.out.println("Sum of Odd numbers::"+sumOdd);
	}

	/**
	 * @param numbers
	 * @return
	 */
	private static int calculateSumOdd(List<Integer> numbers) {
		return numbers.stream()
				.filter(num->num%2==0)
				.mapToInt(Integer::intValue)
				.sum();
	}

	/**
	 * @param numbers
	 * @return
	 */
	private static int calculateSumEven(List<Integer> numbers) {
		return numbers.stream()
				.filter(num->num%2!=0)
				.mapToInt(Integer::intValue)
				.sum();
		
	}

}
