/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *DelL
 */
class Dog1 {
	protected void speak1() {
		System.out.println("woof woof");
	}
}

interface AnimalLanguage1 {
	default void speak() {
		System.out.println("Bark bark woof woof");
	}
}

class Cat1 extends Dog1 implements AnimalLanguage1 {

	
	public void communicate() {
		speak();
	}
}

public class TestMain1 {
	public static void main(String[] args) {
		Cat1 cat1 = new Cat1();
		cat1.communicate();
	}
}
