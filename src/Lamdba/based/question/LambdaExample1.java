/**
 * 
 */
package Lamdba.based.question;

import java.util.Arrays;
import java.util.List;

/**
 * Lamdba.based.question
 *DelL
 */
public class LambdaExample1 {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("John", "Alice", "Bob", "David","12366gjggjgh");
		list.sort((o1, o2) ->o1.compareTo(o2) );
		System.out.println(list);
	}
}
