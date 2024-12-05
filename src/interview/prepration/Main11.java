/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 * 
 * @author Rajan kumar
 */
class Parent1
{
	private int x=10;
	void show()
	{
		System.out.println(x);
	}
}
class Child1 extends Parent1
{
	private int x=11;
	void show1()
	{
		System.out.println(x);
	}
}
public class Main11 {
	public static void main(String[] args) {
//		Parent1 parent1=new Parent1();
		Parent1 parent1=new Parent1();
		parent1.show();
		String string="Rajan";
		String str= string.substring(2, 4);
		System.out.println(str);
		String string2=string.substring(3);
		System.out.println(string2);
	}

}
