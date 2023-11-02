/**
 * 
 */
package StreamBasedQuestions;

import java.util.Arrays;
import java.util.List;

/**
 * @author deby7 6:40:17 pm 2023 Java_8_Features_examples TODO Check if a list
 *         of strings are palindromes using a lambda expression.
 */
public class CheckPalindromes1 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("radar", "hello", "level", "world", "deified");
		stringList.forEach(str->
		{
			boolean isPalindrome=isPalindrome(str);
			System.out.println(str+"  is a palindrome :"+isPalindrome);
		});
	}

	/**
	 * @param str
	 * @return
	 */
	private static boolean isPalindrome(String str) {
		str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		return new StringBuilder(str).reverse().toString().equals(str);
	}
}
