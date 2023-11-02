/**
 * 
 */
package StreamBasedQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 8:43:27 am 2023 Java_8_Features_examples TODO
 * Remove duplicate elements from a list using a lambda expression.
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer>numbers=new ArrayList<>();
		 numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(2);
	        numbers.add(4);
	        numbers.add(1);
	        numbers.add(5);
	        List<Integer>duplicate=numbers.stream()
	        		.distinct()
	        		.collect(Collectors.toList());
	        System.out.println("origanal list:"+numbers);
	        System.out.println(" Duplicate remove element "+duplicate);
	}

}
