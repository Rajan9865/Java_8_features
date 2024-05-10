/**
 * 
 */
package stream.based.questions;

import java.util.function.Function;

/**
 * @author deby7 9:03:11 am 2023 Java_8_Features_examples TODO
 * Use a lambda expression to reverse a string.
 */
public class StringReverser {
	public static void main(String[] args) {
		String input="Hello World";
		Function<String, String>reverseString=str->new StringBuilder(str).reverse().toString();
		String reverse=reverseString.apply(input);
		System.out.println("original string :"+input);
		System.out.println("reverse string :"+reverse);
	}

}
