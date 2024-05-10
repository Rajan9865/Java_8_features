/**
 * 
 */
package Lamdba.based.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7
 *4:14:42 pm
 *2023
 *Java_8_Features_examples
 *TODO
 *Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
 */
public class StringSortExample {
	public static void main(String[] args) {
		 List<String> stringList = new ArrayList<>();
	        stringList.add("Apple");
	        stringList.add("Banana");
	        stringList.add("Cherry");
	        stringList.add("Date");
	        stringList.add("Fig");
	        Collections.sort(stringList,(str1,str2)->str1.compareTo(str2));
	        System.out.println("Normal Collections methods by");
	        System.out.println(" Sorted List"+stringList);
	        
	        stringList=stringList.stream()
	        		.sorted((str1,str2)->str1.compareTo(str2))
	        		.collect(Collectors.toList());
	        
	        System.out.println("By stream ");
	        System.out.println("Sorted list "+stringList);
	}

}
