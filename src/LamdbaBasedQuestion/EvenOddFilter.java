/**
 * 
 */
package LamdbaBasedQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author deby7
 *9:18:02 am
 *2023
 *Java_8_Features_examples
 *TODO
 *
 *Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
 *
 */
public class EvenOddFilter {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer>evenNumbers=filterEvenNumbers(numbers);
		List<Integer>oddNumbers=filterOddNumbers(numbers);
		
		System.out.println("Original numbers list::"+numbers);
		System.out.println("Even numbers::"+evenNumbers);
		System.out.println("Odd numbers::"+oddNumbers);
		
		
		
		/*
		 *  another methods to write this code 
		 *  
		 */
		List<Integer>EvenNumbers=numbers.stream()
				.filter(number->number%2==0)
				.collect(Collectors.toList());
		List<Integer>OddNumbers=numbers.stream()
				.filter(number->number%2!=0)
				.collect(Collectors.toList());
		System.out.println(" * Even number "+EvenNumbers);
		System.out.println(" * Even number "+OddNumbers);
		
		/*
		 * another way to write this code 
		 */
		Map<Boolean, List<Integer>>partionedNumbers=numbers.stream()
				.collect(Collectors.partitioningBy(number->number%2==0));
		List<Integer>evenNum=partionedNumbers.get(true);
		List<Integer>oddNum=partionedNumbers.get(false);
		System.out.println("*****Even number"+evenNum);
		System.out.println("*****Odd number"+oddNum);
				
	}
	/**
	 * 
	 * @param number
	 * @resposible this methods to check even number
	 * @return
	 */
	public static boolean isEven(int number)
	{
		return number%2==0;
	}
	/**
	 * 
	 * @param number
	 * @responsible for To check odd number 
	 * @return
	 */
	public static boolean isOdd(int number)
	{
		return number%2!=0;
	}

	/**
	 * @param numbers
	 * @return
	 */
	private static List<Integer> filterOddNumbers(List<Integer> numbers) {
		return numbers.stream()
				.filter(EvenOddFilter::isEven)
				.collect(Collectors.toList());
		
	}

	/**
	 * @param numbers
	 * @return
	 */
	private static List<Integer> filterEvenNumbers(List<Integer> numbers) {
		return numbers.stream()
				.filter(EvenOddFilter::isOdd)
				.collect(Collectors.toList());
	}

}
