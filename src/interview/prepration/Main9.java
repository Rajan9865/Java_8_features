/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *@author Rajan kumar
 */
class Base2 {
	{
		System.out.println("Instance initializer in Base");
	}

	Base2() {
		System.out.println("constructor of base");
	}
}

class Derived2 extends Base2 {
	{
		System.out.println("Instance initializer in Derived");
	}

	Derived2() {
		System.out.println("constructor of derived");
	}
}

public class Main9 {
	public static void main(String[] args) {
//		new Derived2();
		Base2 base2=new Derived2();
	}
}
