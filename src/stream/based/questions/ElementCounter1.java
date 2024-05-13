/**
 * 
 */
package stream.based.questions;

import java.util.Arrays;
import java.util.List;

/**
 * @author deby7 8:38:54 am 2023 Java_8_Features_examples TODO
 * Count the occurrences of a specific element in a list using a lambda expression.
 */
public class ElementCounter1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 2, 6, 7, 2);
		int elementCount=2;
		long cout=numbers.stream()
				.filter(num->num==elementCount)
				.count();
		System.out.println(cout);
	}

}
