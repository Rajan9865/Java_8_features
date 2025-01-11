/**
 * 
 */
package interview.prepration;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * interview.prepration
 *@author Rajan kumar
 */
public class TryWithResourcesExample {
	public static void main(String[] args) {
		try (BufferedReader bufferedReader=new BufferedReader(new FileReader("file.txt"))){
			System.out.println(bufferedReader.readLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		String string="madam1";
		String string2 = new StringBuilder(string).reverse().toString();
		System.out.println(string.equals(string2));
	}
}
