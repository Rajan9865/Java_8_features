/**
 * 
 */
package LamdbaBasedQuestion;

/**
 * @author deby7
 *8:45:14 am
 *2023
 *Java_8_Features_examples
 *TODO
 */
interface StringConcatenator {
	String concatenate (String str1, String str2);
}
public class LambdaStringConcatenation {
	public static void main(String[] args) {
		StringConcatenator concatenator=(str1,str2)->str1+str2;
		String firstString="Hello";
//		String SecondString="World";
		String secondString = "World";

		String result=concatenator.concatenate(firstString, secondString);
		System.out.println("Concanated string ="+ result);
	}

}
