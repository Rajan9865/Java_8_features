/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 7:12:59 am 2023 Java_8_Features_examples TODO
 */
interface InterF4 {
	public int square(int x);
}

class Demo4 implements InterF4 {

	@Override
	public int square(int x) {
		return x * x;
	}

}

public class Lamda4Without_lamda {
	public static void main(String[] args) {
		InterF4 interF4 = new Demo4();
		// interF4.square(5);
		System.out.println("the square of :" + interF4.square(5));

	}

}
