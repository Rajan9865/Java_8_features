/**
 * 
 */
package gfg.basic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class EvenNumber {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer>evenNumberIntegers= numbers.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(evenNumberIntegers);
		System.out.println("*************");
		System.out.println("grouping by ");
		List<String> strings = Arrays.asList("apple", "bat", "cat", "banana", "dog");
		Map<Integer, List<String>>groupByLengthMap= strings.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupByLengthMap);
	}

}
