/**
 * 
 */
package java.guide;

import java.util.function.Function;

/**
 * @author deby7
 *9:27:13 am
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class FunctionInterfaceExample2 {
public static void main(String[] args) {
	Function<String, Integer>function=s->s.length();
	Function<Integer, Integer>function2=t->t*2;
	System.out.println(function.andThen(function2).apply("Rajan"));
}

}
