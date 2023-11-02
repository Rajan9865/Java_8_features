/**
 * 
 */
package StreamBasedQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author deby7 8:03:10 am 2023 Java_8_Features_examples TODO
 * Sort a list of integers in ascending order using a lambda expression.
 */
public class SortIntegers1 {
	public static void main(String[] args) {
		List<Integer>integerList=new ArrayList<>();
		integerList.add(8);
		integerList.add(10);
		integerList.add(9);
		integerList.add(5);
		integerList.add(55);
		integerList.add(40);
		integerList.add(21);
		integerList.add(05);
		integerList.add(5);
		integerList.add(47);
		// Sorting the list in ascending order using a lambda expression
		Collections.sort(integerList,(a,b)->a.compareTo(b));
		integerList.forEach(System.out::println);
		// Sorting the list in descending  order using a lambda expression
		Collections.sort(integerList,(a,b)->b.compareTo(a));
		integerList.forEach(System.out::println);
		/*
		for (Integer numInteger : integerList) {
			System.out.println(numInteger);
		}
		*/
	}

}
