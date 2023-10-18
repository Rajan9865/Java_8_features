/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7
 *11:38:05 pm
 *2023
 *Java_8_Features_examples
 *TODO
 */
@FunctionalInterface
interface Interf1
{
		public void methodOne();
}
public class Lamda2With_lamda {
public static void main(String[] args) {
	Interf1 interf=()->System.out.println("excetue Methods one");
	interf.methodOne();
}
}
