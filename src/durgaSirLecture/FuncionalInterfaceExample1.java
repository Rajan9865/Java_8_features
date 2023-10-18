/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7
 *6:56:18 am
 *2023
 *Java_8_Features_examples
 *TODO
 */
@FunctionalInterface
interface A1
{
	public void name1();
}
/*
 * @responsible for same method is considered
 */
@FunctionalInterface
interface B1 extends A1
{
	public void name1();
}
public class FuncionalInterfaceExample1 {

}
