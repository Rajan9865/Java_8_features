/**
 * 
 */
package java_guide;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author deby7
 *7:48:56 am
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class TraditionalExample {
//	****************************
	// traditional methods
	/*
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// Using an anonymous class to filter even numbers
		numbers.forEach(new EvenNumberFilter());
	}
	  private static class EvenNumberFilter implements Consumer<Integer>{

		@Override
		public void accept(Integer t) {
			if (t%2==0) {
				System.out.println(t);
			}
		}
		
	}
	*/
	
//	************************************
	// using java 8 lambda expression 
	/*
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// Using Lambda expression to filter even numbers and print
	
		numbers.forEach(n->{
			if (n%2==0) {
				System.out.println(n);
			}
		});
	}
	*/
	
//	************************************** using stream api  filter 
	/*
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numbers.stream().filter(n->n%2==0)
		.forEach(System.out::println);
	}
	*/
	
	//******************************************** using for each methods 
	/*
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numbers.forEach(n->{
			if (n%2==0) {
				System.out.println(n);
			}
		});
	}
	*/
	//**************************************************  using for each methods reference 
	/*
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//using for each methods reference 
		numbers.forEach(TraditionalExample::printIfEven);
	}
	private static void printIfEven(int n) {
		if (n%2==0) {
			System.out.println(n);
		}
	}
	*/
	
	//**************************   Use filter and collect with tolist
	
	/*
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// using filter and collect with tolist
		List<String> result=numbers.stream().filter(n->n%2==0)
				.map(Object::toString)
				.collect(Collectors.toList());
		System.out.println(result);
	}
	*/
	
	//**************************   Use filter and collect with joining
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// using filter and collect with joining 
		String result=numbers.stream().filter(n->n%2==0)
				.map(Object::toString)
				.collect(Collectors.joining("\n"));
		System.out.println(result);
	}
}
