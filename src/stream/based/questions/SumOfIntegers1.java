/**
 * 
 */
package stream.based.questions;

import java.util.Arrays;
import java.util.List;

/**
 * @author deby7 2:59:41 pm 2023 Java_8_Features_examples TODO
 * Calculate the sum of integers in a list using a lambda expression.
 */
public class SumOfIntegers1 {
	public static void main(String[] args) {
//		List<Integer>integerslist=new ArrayList<>();
		List<Integer>integerlistIntegers=Arrays.asList(1,2,3,4,5);
		// 1st way using methods reference
//		int sum=integerlistIntegers.stream().mapToInt(Integer::intValue).sum();
		// 2nd way using lamdba expression
		int sum=integerlistIntegers.stream()
				.mapToInt(i->i)
				.sum();
		System.out.println("sum of integer:"+sum);
		
	}

}
