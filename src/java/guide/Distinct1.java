/**
 * 
 */
package java.guide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7
 *7:57:20 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class Distinct1 {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("rajan","ramu","ramu");
		List<String>resultList=list.stream().distinct().collect(Collectors.toList());
		System.out.println(resultList);
		resultList.forEach(System.out::println);
	}

}
