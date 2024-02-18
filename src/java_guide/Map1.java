/**
 * 
 */
package java_guide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7
 *7:40:56 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class Map1 {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("1","2","3","4");
		List<Integer>list2=list.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(list2);
		list2.forEach(System.out::println);
	}

}
