/**
 * 
 */
package java_guide;

import java.io.PrintWriter;

/**
 * @author deby7
 *6:08:07 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */
@FunctionalInterface
interface FunctionalInterfaceTesting{
	public void execute();
	public default void print(String msg)
	{
		System.out.println("hello worlds");
	}
	public static void print(String text,PrintWriter writer)
	{
		writer.write(text);
	}
	
}

public class MyFunctionalInterface implements FunctionalInterfaceTesting{

	@Override
	public void execute() {
		
	}

}
