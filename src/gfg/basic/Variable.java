/**
 * 
 */
package gfg.basic;

import java.util.List;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class Variable {
	public static void main(String[] args) {
		var message="hello world";
		 var number = 42; // Inferred as int
		 var price = 99.99; // Inferred as double
		 var names = List.of("Java", "Spring", "Microservices"); // Inferred as List<String>
		 System.out.println(message);
		 System.out.println("Number: " + number);
		 System.out.println("Price: $" + price);
		 System.out.println("Topics: " + names);
	}

}
