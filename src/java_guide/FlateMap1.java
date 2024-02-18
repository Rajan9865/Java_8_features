/**
 * 
 */
package java_guide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author deby7
 *7:53:54 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class FlateMap1 {
public static void main(String[] args) {
	List<Integer> evens = Arrays.asList(2, 4, 6);
    List<Integer> odds = Arrays.asList(3, 5, 7);
    List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
    List<Integer>result=Stream.of(evens,odds,primes).flatMap(s->s.stream()).collect(Collectors.toList());
    System.out.println(result);
}
}
