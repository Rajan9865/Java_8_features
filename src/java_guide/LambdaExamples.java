/**
 * 
 */
package java_guide;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author deby7
 *8:07:14 am
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class LambdaExamples {
	public static void main(String[] args) {
		// lamdba with no paarameter and no argumnets 
		Runnable runnable=()->System.out.println("Hellow worls");
		runnable.run();
		
		//lamdba with single parameter and no return type declaration
		Consumer<String> consumnerConsumer=(s)->System.out.println(s);
		consumnerConsumer.accept("single parameter , no type ");
		
		// single parameter and type declaration
		Consumer<String>singleparameterwitjtype=(String s1)->System.out.println(s1);
		singleparameterwitjtype.accept("single parameter , with type ");
		
		// Lambda with multiple parameters, type inferred
		BiFunction<Integer, Integer, Integer>biFunction=(a,b)->a+b;
		System.out.println(biFunction.apply(5, 5));
		
		// Lambda with multiple parameters, type declared
		BiFunction<Integer, Integer, Integer>biFunction2=(Integer a, Integer b)->a+b;
		System.out.println(biFunction2.apply(10, 10));
		
		// Lambda with a return statement (multiple lines)
		BiFunction<Integer, Integer, Integer>biFunction3=(Integer a, Integer b)->
		{
			int sum=a+b;
			return sum;
		};
		System.out.println(biFunction3.apply(15, 15));
		
		// Lambda with no parameters and a return value
		Supplier<Integer>supplier=()->10;
		System.out.println(supplier.get());
		
	}
}
