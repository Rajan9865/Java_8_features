/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *DelL
 */

class A
{
	static void show()
	{
		System.out.println("class a show");
	}
}
class B extends A
{
	static void show()
	{
		System.out.println("class b Show");
	}
}
public class Main6 {
	public static void main(String[] args) {
//		A a=new A();
//		a.show();
		A a=new B();
		a.show();
	}

}
