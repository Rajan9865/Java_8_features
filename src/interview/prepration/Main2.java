/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *@author Rajan kumar
 */
class Parent 
{
	void display()
	{
		System.out.println("parent display methods");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("child display methos");
	}
}
public class Main2 {
	public static void main(String[] args) {
		Parent parent=new Child();
		parent.display();
	}

}
