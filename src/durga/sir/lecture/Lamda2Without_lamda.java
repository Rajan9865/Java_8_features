/**
 * 
 */
package durga.sir.lecture;

/**
 * @author deby7
 *11:23:19 pm
 *2023
 *Java_8_Features_examples
 *TODO
 */
//@FunctionalInterface
 interface interf
{
	public void methodOne(); 
	public void methodTwo();
}
  class Demo implements interf
 {

	@Override
	public void methodOne() {
		System.out.println("Hello world");
		
	}

	@Override
	public void methodTwo() {
		System.out.println("methods two");
		
	}
	 
 }
public class Lamda2Without_lamda {
	public static void main(String[] args) {
		interf inter=new Demo();
		inter.methodOne();
		inter.methodTwo();
	}

}
