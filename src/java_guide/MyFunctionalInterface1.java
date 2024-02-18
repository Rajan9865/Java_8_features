/**
 * 
 */
package java_guide;

/**
 * @author deby7
 *6:07:27 am
 *2024
 *Java_8_Features_examples
 *TODO
 */

// for testing  purpose 
@FunctionalInterface
public interface MyFunctionalInterface1 {
	void print(String msg);
//	void print(int num);  //this is not valid 
	default void m1()
	{
		System.out.println("m1 methods ");
	}
	static void m2() {
		System.out.println("m2 methods ");
	}
}
