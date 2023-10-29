/**
 * 
 */
package Java8QuestionsAnswer;

import java.util.stream.LongStream;

/**
 * @author deby7 7:00:36 pm 2023 Java_8_Features_examples TODO
 * Calculate the factorial of a given number using a lambda expression.
 */
public class FactorialLambda1 {
	public static void main(String[] args) {
		int number=5;
		 long factorial = LongStream.rangeClosed(1, number)
	                .reduce(1, (x, y) -> x * y);
//		long result=factorial.apply(number);
		System.out.println("factorial of "+number +" is: "+factorial);
	}

}
