/**
 * 
 */
package durga.sir.lecture;

/**
 * @author deby7 4:23:11 pm 2023 Java_8_Features_examples TODO
 */
interface Example2
{
	public void testing1();
}
public class WithLamdaFunction1 {
public static void main(String[] args) {
	Example2 example2=()->System.out.println("Hello worlds ");
	example2.testing1();
}
}
