/**
 * 
 */
package StreamBasedQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author deby7 7:54:00 am 2023 Java_8_Features_examples TODO
 * Sort a list of integers in ascending order using a lambda expression.
 */
public class SortIntegers2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Integer>integerList=new ArrayList<>();
		System.out.println(" Enter the integer the one per line and if you 'done' to finish");
		while (true) {
			String inputString=scanner.nextLine();
			if (inputString.equalsIgnoreCase("done")) {
				break;
			}
			try {
				int number=Integer.parseInt(inputString);
				integerList.add(number);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input  , please inter the valid integer :");
			}
		}
		System.out.println("Enter 'asc' for ascending order or 'desc' for descending order:");
		String orderChoiceString=scanner.nextLine();
		if (orderChoiceString.equalsIgnoreCase("asc")) {
			// collection sort in ascending order 
			Collections.sort(integerList);
		}
		else if (orderChoiceString.equalsIgnoreCase("desc")) {
			// descending order
			Collections.sort(integerList,Collections.reverseOrder());
		}
//		Collections.sort(integerList,orderChoiceString.equalsIgnoreCase("desc")?Collections.reverseOrder():null);
		else {
			System.out.println("Invalid Choice, Please enter asc and desc: ");
		}
		
		integerList.forEach(System.out::println);
		/*
		System.out.println("In Ascending order :");
		integerList.sort((a,b)->a.compareTo(b));
		integerList.forEach(System.out::println);
		*/
	}
}
