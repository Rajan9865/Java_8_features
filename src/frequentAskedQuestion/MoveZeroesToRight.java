/**
 * 
 */
package frequentAskedQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * frequentAskedQuestion
 * 
 * @author Rajan kumar
 */
public class MoveZeroesToRight {
	public static void main(String[] args) {
		List<Integer> numberIntegers = Arrays.asList(0, 1, 0, 4, 0, 6, 7, 0, 8, 0);
		List<Integer> collect = Stream.concat(numberIntegers.stream().filter(num -> num != 0),
				numberIntegers.stream().filter(num -> num == 0))
				.collect(Collectors.toList());
		System.out.println(collect);
	}
}
