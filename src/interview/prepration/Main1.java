/**
 * 
 */
package interview.prepration;

import java.util.Vector;

/**
 * interview.prepration
 *DelL
 */
abstract class Vechicle {
	abstract void start();

	void stop() {
		System.out.println("vechicle stopped");
	}
}
class Car extends Vechicle {
	@Override
	void start() {
		System.out.println("car started with key");
	}
	
//	void stop() {
//		System.out.println("vechicle car stopped");
//	}
}
class Bike extends Vechicle {
	@Override
	void start() {
		System.out.println("bike started with kick");
	}
}

public class Main1 {
	public static void main(String[] args) {
		Vechicle vechicle=new Car();
		vechicle.stop();
		vechicle.start();
		Vechicle vechicle2=new Bike();
		vechicle2.start();
		vechicle2.stop();
	}
}
