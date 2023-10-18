/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 4:31:00 pm 2023 Java_8_Features_examples TODO
 */
interface Example3
{
	public void sum(int a, int b);
}
class Demo3 implements Example3{

	@Override
	public void sum(int a, int b) {
		System.out.println("the sum of :"+(a+b));
	}
	
}
public class WithoutLamdaFunction2 {
	public static void main(String[] args) {
		Example3 example3=new Demo3();
		example3.sum(11, 22);
		
	}

}
