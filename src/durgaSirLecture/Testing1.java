/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 6:17:00 pm 2023 Java_8_Features_examples TODO
 */
interface Example7
{
	public void m1();
}
public class Testing1 {
	int x=777;
	public void m2()
	{
		Example7 example7=()->
		{
			int x=888;
			System.out.println(x);
			System.out.println(this.x);
		};
		example7.m1();
	}
	public static void main(String[] args) {
		Testing1 testing1=new Testing1();
		testing1.m2();
	}

}
