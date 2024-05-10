/**
 * 
 */
package java.guide;

/**
 * @author deby7
 *6:17:42 am
 *2024
 *Java_8_Features_examples
 *TODO
 */

interface Shape1{
	void draw();
}
class Ractangle1 implements Shape1
{

	@Override
	public void draw() {
		System.out.println("draw methods");
	}

	
}
public class LamdbaExample1 {
	public static void main(String[] args) {
		
		/*
		Shape1 shape1=()->{
			System.out.println("draw methods");
		};
		shape1.draw();
		*/
		Shape1 shape1=()-> 
			System.out.println("draw methods");
			shape1.draw();
	}


}
