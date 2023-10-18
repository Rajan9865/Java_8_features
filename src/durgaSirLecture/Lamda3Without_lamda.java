/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7
 *11:48:16 pm
 *2023
 *Java_8_Features_examples
 *TODO
 */
interface Inter
{
	public void sum(int a, int b);
}
class Demo1 implements Inter
{

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println((a+b));
		
	}
	
}
public class Lamda3Without_lamda {
	public static void main(String[] args) {
		Inter inter=new Demo1();
		inter.sum(20, 10);
	}

}
