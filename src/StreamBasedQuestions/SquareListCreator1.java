/**
 * 
 */
package StreamBasedQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 8:19:44 am 2023 Java_8_Features_examples TODO
 * Use a lambda expression to create a list of squares for numbers in a given list.
 */
public class SquareListCreator1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer>squareNumberIntegeris=numbers.stream()
				.map(num->num*num)
				.collect(Collectors.toList());
		System.out.println("List of square number :"+squareNumberIntegeris);
	}

}
