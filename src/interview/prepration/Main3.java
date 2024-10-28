/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *@author Rajan kumar
 */

class Base
{
	Base()
	{
		System.out.println("base class constructor");
	}
}
class Derived extends Base
{
	Derived()
	{
		System.out.println("derived class constructor");
	}
}

public class Main3 {
	public static void main(String[] args) {
//		new Base();|
		new Derived();
	}

}
