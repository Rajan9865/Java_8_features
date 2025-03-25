/**
 * 
 */
package durga.sir.lecture;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * durga.sir.lecture
 *DelL
 */
public class StreamExample {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,67,8,9);
		List<Integer> collect = asList.stream().filter(n->n%2==0)
		.collect(Collectors.toList());
		System.out.println(as);
	}

}
