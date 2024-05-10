/**
 * 
 */
package Lamdba.based.question;

import java.util.function.Function;

/**
 * @author deby7
 *12:45:42 am
 *2023
 *Java_8_Features_examples
 *TODO
 *Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
 */
public class FactorialCalculator {
	public static void main(String[] args) {
		int number=5;
		Function<Integer, Long>factorial=n->
		{
			long result=1;
			for(int i=1;i<=number;i++)
			{
				result*=i;
			}
			return result;
		};
		long result=factorial.apply(number);
		System.out.println("factorial of "+number+" is :"+result);
		System.out.println("");
		System.out.println("Another methods **");
		Function<Integer, Long>factorialnumbers=n->n==0?1:n*factorial.apply(n-1);
		long resultNumbers=factorialnumbers.apply(number);
		System.out.println("factorial of :"+number+ " is "+resultNumbers);
	}

}
