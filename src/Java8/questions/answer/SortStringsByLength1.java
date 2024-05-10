/**
 * 
 */
package Java8.questions.answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author deby7 8:24:51 am 2023 Java_8_Features_examples TODO
 * Sort a list of strings by their length in ascending order using a lambda expression.
 */
public class SortStringsByLength1 {
	public static void main(String[] args) {
		List<String>strings=new ArrayList<>();
		 strings.add("apple");
	        strings.add("banana");
	        strings.add("cherry");
	        strings.add("date");
	        strings.add("fig");
	        Collections.sort(strings,(str1,str2)->str1.length()-str2.length());
	        System.out.println("Sorted string   by length in ascending order :");
	        for(String str:strings)
	        {
	        	System.out.println(str);
	        }
	}

}
