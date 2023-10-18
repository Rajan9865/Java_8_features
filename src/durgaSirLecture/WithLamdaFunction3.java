/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 5:33:23 pm 2023 Java_8_Features_examples TODO
 */
interface Example6
{
	public int square(int x);
}
public class WithLamdaFunction3 {
	public static void main(String[] args) {
		Example6 example6=(x)->x*x;
		System.out.println("The square is "+example6.square(11));
		Example6 example61=x->x*x;
		System.out.println("The square is "+example61.square(10));
	}

}
