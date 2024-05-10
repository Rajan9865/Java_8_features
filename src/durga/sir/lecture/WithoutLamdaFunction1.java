/**
 * 
 */
package durga.sir.lecture;

/**
 * @author deby7
 *4:18:43 pm
 *2023
 *Java_8_Features_examples
 *TODO
 */
interface Example1{
	public void example1();
}
class Demo2 implements Example1
{

	@Override
	public void example1() {
		System.out.println("this is the firsst methods");
	}
	
}
public class WithoutLamdaFunction1 {
	public static void main(String[] args) {
		Example1 example1=new Demo2();
		example1.example1();
	}

}
