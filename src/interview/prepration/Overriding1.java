/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *@author Rajan kumar
 */

class Animal {
	void sound() {
		System.out.println("some generic animal sounds");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("meow");
	}
}

class Dog2 extends Animal {
	void sound() {
		System.out.println("Bark");
	}
}
public class Overriding1 {
	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.sound();//generic
		Animal animal2=new Cat();
		animal2.sound();//meow
		Animal animal3=new Dog2();
		animal3.sound();//bark
		Dog2 dog2=new Dog2();
		dog2.sound();//bark
	}

}
