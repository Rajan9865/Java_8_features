/**
 * 
 */
package Java8.questions.answer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author deby7 7:21:34 am 2023 Filter Strings by Length: Create a lambda
 *         expression to filter strings from a list based on their length.
 *         Java_8_Features_examples TODO
 */
public class StringLengthFilter1 {
	public static void main(String[] args) {
		ArrayList<String> stringsliArrayList = new ArrayList<>(
				Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape"));
		int desiredListLength=5;
//		System.out.println(stringsliArrayList);
		stringsliArrayList.removeIf(str->str.length()!=desiredListLength);
		stringsliArrayList.forEach(System.out::println);
//		System.out.println(stringsliArrayList);

	}

}
