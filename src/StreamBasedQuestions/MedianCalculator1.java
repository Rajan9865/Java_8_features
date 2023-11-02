/**
 * 
 */
package StreamBasedQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 10:26:50 pm 2023 Java_8_Features_examples TODO
 * Calculate the median of a list of integers using a lambda expression
 */
public class MedianCalculator1 {
	public static void main(String[] args) {
		List<Integer>numbersIntegers=Arrays.asList(7, 3, 1, 5,1, 2, 6, 4, 8);
		double median=calculateMedian(numbersIntegers);
		System.out.println("median  :"+median);
	}

	/**
	 * @param numbersIntegers
	 * @return
	 */
	private static double calculateMedian(List<Integer> numbersIntegers) {
		List<Integer>sortedNumberIntegers=numbersIntegers.stream()
				.sorted()
				.collect(Collectors.toList());
		int size=sortedNumberIntegers.size();
		System.out.println(size);
		
		return size%2==0
				?(sortedNumberIntegers.get(size/2-1)+sortedNumberIntegers.get(size/2))/2.0
						:sortedNumberIntegers.get(size/2);
	}

}
