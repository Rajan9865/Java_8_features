/**
 * 
 */
package Java8QuestionsAnswer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author deby7 7:34:47 am 2023 Java_8_Features_examples TODO Filter Strings by
 *         Length: Create a lambda expression to filter strings from a list
 *         based on their length.
 */

public class StringLengthFilter2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the desired String lennght :");
		int desiredLength = scanner.nextInt();
		scanner.nextLine();
		List<String> arrayliStrings = new ArrayList<>();
		System.out.println("Enter a list of strings (one per line), and type 'done' to finish:");
		String inputString;
		while (true) {
			inputString = scanner.nextLine();
			if (inputString.equalsIgnoreCase("done")) {
				break;

			}
			arrayliStrings.add(inputString);
		}
		List<String> filtedList = arrayliStrings.stream().filter(str -> str.length() >= desiredLength)
				.collect(Collectors.toList());
		System.out.println("Strig with the desired List:");
		filtedList.forEach(System.out::println);

	}
}
