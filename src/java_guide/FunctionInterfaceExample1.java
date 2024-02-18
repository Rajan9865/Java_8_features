/**
 * 
 */
package java_guide;

import java.util.function.Function;

/**
 * @author deby7
 *8:23:27 pm
 *2024
 *Java_8_Features_examples
 *TODO
 *
 */

public class FunctionInterfaceExample1 {
	public static void main(String[] args) {
		System.out.println("1st example");
		Function<String, Integer>function=s->s.length();
		System.out.println(function.apply("rajan  "));
		System.out.println("2nd example ");
		
		Function<Integer, String>function2=num->
		{
			if (num%2==0) {
				return "number " +num+ " is even";
			}
			else {
				return "number " +num +" is odd";
			}
		};
		System.out.println(function2.apply(11));
		
		System.out.println("3rd example using turory ");
		Function<Integer, String>function3=num->(num%2==0)?"number "+num+" is even":"number "+num+" is odd";
		System.out.println(function3.apply(5));
		
		System.out.println("4th example using terery operator");
		Function<Integer, String>function4=num->
		{
			return (num%2==0)?"number "+num+" is even":"number "+num+" is odd";
		};
		System.out.println(function4.apply(10));
	}

}
