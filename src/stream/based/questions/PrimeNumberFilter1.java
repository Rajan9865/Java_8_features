/**
 * 
 */
package stream.based.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 10:02:58 pm 2023 Java_8_Features_examples TODO
 * Write a lambda function to filter prime numbers from a list of integers.
 */
public class PrimeNumberFilter1 {
	public static void main(String[] args) {
		List<Integer>numberIntegers=Arrays.asList(2,3,4,5,6,7,8,9,10);
		List<Integer>primeNumberIntegers=numberIntegers.stream()
				.filter(num->isPrime(num))
				.collect(Collectors.toList());
		System.out.println(primeNumberIntegers);
	}

	/**
	 * @param num
	 * @return
	 */
	private static boolean isPrime(int num) {
		if (num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}

	
}
