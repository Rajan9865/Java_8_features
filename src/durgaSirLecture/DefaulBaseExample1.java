/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7
 *11:09:46 pm
 *2023
 *Java_8_Features_examples
 *TODO
 */
interface Example9
{
	default void m1()
	{
		System.out.println("Default methods");
	}
}
public class DefaulBaseExample1 implements Example9{
	public static void main(String[] args) {
		DefaulBaseExample1 defaulBaseExample1=new DefaulBaseExample1();
		defaulBaseExample1.m1();
	}

}
