/**
 * 
 */
package LamdbaBasedQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7
 *10:48:24 pm
 *2023
 *Java_8_Features_examples
 *TODO
 *Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
 */

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1, 2, 3, 2, 4, 3, 5, 6, 1);
		List<Integer>distinctIntegers=numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("original list:"+numbers);
		System.out.println("using Stram:");
		System.out.println("list with duplicate removed:"+distinctIntegers);
		
		System.out.println("Another methods ************");
		List<Integer>distnumbers=numbers.stream()
				.distinct()
				.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
		System.out.println("*********************:");
		System.out.println("list with duplicate removed:"+distnumbers);
		System.out.println("");
		System.out.println("Another methods using Set ************");
		System.out.println("");
		List<Integer>distinctUmbers=numbers.stream()
				.collect(Collectors.toSet())
				.stream()
				.collect(Collectors.toList());
		System.out.println("Oringinal list:"+numbers);
		System.out.println("Duplicte removed number :"+distinctUmbers);
		System.out.println("************");
		System.out.println("another methods");
		List<Integer>distinctNumbers=new ArrayList<>();
//		List<Integer>distinctNumbers=
				numbers.stream()
				.distinct()
				.forEach(distinctNumbers::add);
				System.out.println("duplicate removed "+distinctNumbers);
	}

}
