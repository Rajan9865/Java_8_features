	/**
 * 
 */
package LamdbaBasedQuestion;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * @author deby7
 *9:51:17 am
 *2023
 *Java_8_Features_examples
 *TODO
 *Write a Java program to implement a lambda expression to create a lambda expression
 * to check if a number is prime.
 */
public class PrimeChecker {
	public static void main(String[] args) {
			int number=17;
			Predicate<Integer>isPrimePredicate=n->
			{
				if (n<=1) {
					return false;
				} 
				for(int i=2;i<=Math.sqrt(n);i++)
				{
					if (n%i==0) {
						return false;
					}
				}
				return true;
			};
			boolean result=isPrimePredicate.test(number);
			System.out.println(number+" is prime "+ result);
			
			System.out.println("Another methods to write this code :***********");
			System.out.println("Another methods to write this code :***********");
			System.out.println("Another methods to write this code :***********");
			Predicate<Integer>isPrime=n->n>=1&&IntStream.range(2, (int)Math.sqrt(n)+1)
					.noneMatch(i->n%i==0);
			boolean resultPrime=isPrime.test(number);
			System.out.println(number+" is prime "+resultPrime);
    }
}
