/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 4:54:26 pm 2023 Java_8_Features_examples TODO
 */
interface Example4
{
	public void Sum(int a,int b);
}
public class WithLamdaFunction2 {

	public static void main(String[] args) {
		Example4 example4=(a,b)->System.out.println("the sum is :"+(a+b));
		example4.Sum(10, 20);
	}
}
