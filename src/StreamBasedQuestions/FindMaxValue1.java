/**
 * 
 */
package Java8QuestionsAnswer;

import java.util.Arrays;
import java.util.List;

/**
 * @author deby7 3:17:00 pm 2023 Java_8_Features_examples TODO
 * Find the maximum value in a list of integers using a lambda expression.
 */
public class FindMaxValue1 {
	public static void main(String[] args) {
		List<Integer>integerlistIntegers=Arrays.asList(1,2,3,5,10,12);
		Integer maxInteger=integerlistIntegers.stream()
				.max(Integer::compare)
				.orElse(null);
		String messageString=(maxInteger!=null)?"max value is :"+maxInteger:"the list is emmpty";
		/*
		if (maxInteger!=null) {
			System.out.println("max value is :"+maxInteger);
		}
		else {
			System.out.println("the list value is empty");
		}
		*/
		System.out.println(messageString);
	}

}
