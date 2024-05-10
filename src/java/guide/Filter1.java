/**
 * 
 */
package java.guide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7
 *7:21:55 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class Filter1 {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("rajan","shovam","pinki");
		List<String>resultList=list.stream().filter(s->!"rajan".equalsIgnoreCase(s))
				.collect(Collectors.toList());
				System.out.println(resultList);
		resultList.forEach(System.out::println);
	}

}
