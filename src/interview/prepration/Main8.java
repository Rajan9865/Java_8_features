/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *@author Rajan kumar
 */
class Base1
{
	static void staticMethod()
//	void staticMethod()
	{
		System.out.println("static methods bases");
	}
}
class Derived1 extends Base1
{
	static void staticMethod()// static methods not overridden
//	void staticMethod()
	{
		System.out.println("static methods in derived");
	}
}
public class Main8 {
	public static void main(String[] args) {
//		Base1 base1=new Base1();
//		base1.staticMethod();
		Base1 base1=new Derived1();
		base1.staticMethod();
	}

}
