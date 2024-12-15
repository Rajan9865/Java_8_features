/**
 * 
 */
package durga.sir.lecture;

/**
 * @author Rajan kumar 11:09:46 pm 2023 Java_8_Features_examples
 */
interface Example9 {
	default void m1() {
		System.out.println("Default methods");
	}
}

public class DefaulBaseExample1 implements Example9 {
	public static void main(String[] args) {
		DefaulBaseExample1 defaulBaseExample1 = new DefaulBaseExample1();
		defaulBaseExample1.m1();

		Object object = null;
		System.out.println(String.valueOf(object));
//		System.out.println(object.toString());
		String s1 = "apple";
		String s2 = "apple";
		System.out.println(s1.compareTo(s2));

	}

}
