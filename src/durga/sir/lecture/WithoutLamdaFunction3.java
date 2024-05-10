/**
 * 
 */
package durga.sir.lecture;

/**
 * @author deby7 4:58:28 pm 2023 Java_8_Features_examples TODO
 */
interface Example5
{
	public int square(int x);
}
class Demo5 implements Example5
{

	@Override
	public int square(int x) {
		return x*x;
	}
	
}
public class WithoutLamdaFunction3 {
	public static void main(String[] args) {
		Example5 example5=new Demo5();
		System.out.println("The squre is:"+example5.square(5));
		Demo5 demo5=new Demo5();
		System.out.println("The square is:"+demo5.square(10));
	}

}
