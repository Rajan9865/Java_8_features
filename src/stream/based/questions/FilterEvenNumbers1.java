/**
 * 
 */
package stream.based.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 3:31:46 pm 2023 Java_8_Features_examples TODO
 * Write a lambda function to filter even numbers from a list of integers.
 */
public class FilterEvenNumbers1 {
	public static void main(String[] args) {
		List<Integer>integreList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer>evenNumberIntegers=integreList.stream()
				.filter(FilterEvenNumbers1::isEven)
				.collect(Collectors.toList());
		/*
		List<Integer> evenNumberIntegers=integreList.stream()
				.filter(number->number%2==0)
				.collect(Collectors.toList());
		System.out.println(evenNumberIntegers);
		*/
		
		System.out.println(evenNumberIntegers);
	}

	private static boolean isEven(Integer number) {
		return number%2==0;
	}


}
