/**
 * 
 */
package LamdbaBasedQuestion;

import java.util.Arrays;
import java.util.List;

/**
 * @author deby7
 *6:34:24 pm
 *2023
 *Java_8_Features_examples
 *TODO
 *Write a Java program to implement a lambda expression to find the average of a list of doubles.
 */
public class AverageCalculator {
	public static void main(String[] args) {
		List<Double>numbers=Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
				
		double average=numbers.stream()
				.mapToDouble(Double::doubleValue)
				.average()
				.orElse(0.0);
		System.out.println("By stram");
		System.out.println("Aearage :"+average);
		
		double sum=0.0;
		for (double value:numbers) {
			sum+=value;
		}
		double averageno=numbers.isEmpty()?0.0:sum/numbers.size();
		System.out.println("Normal scenerio");
		System.out.println("verage number:"+averageno);
	}

}
