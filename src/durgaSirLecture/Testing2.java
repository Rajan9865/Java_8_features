/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 10:52:32 pm 2023 Java_8_Features_examples TODO
 */
interface Example8
{
	public void m1();
}
public class Testing2 {
	int x=100;
	public void m2()
	{
		int y=200;
		Example8 example8=()->
		System.out.println(x);
		System.out.println(y);
		x=300;
		y=400;
	};
	
}
