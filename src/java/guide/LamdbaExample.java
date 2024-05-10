/**
 * 
 */
package java.guide;

/**
 * @author deby7
 *6:16:52 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */

interface ShapeSize{
	void draw();
}
class Rectangle implements ShapeSize
{

	@Override
	public void draw() {
		System.out.println("Rectangle draw methods .........");
	}
	
}
class Arrow implements ShapeSize
{

	@Override
	public void draw() {
		System.out.println("Arraw is runnig staright forward...");
	}
	
}
public class LamdbaExample {
	public static void main(String[] args) {
		
		/*
		ShapeSize rectangle=()->System.out.println("Rectangle draw methods .........");
		rectangle.draw();
		ShapeSize arrow=()->System.out.println("Arraw is runnig staright forward...");
		arrow.draw();
		*/
		
		/*
		callingMethods(rectangle);
		callingMethods(arrow);
		*/
		
		callingMethods(()->System.out.println("Arraw is runnig staright forward..."));
		callingMethods(()->System.out.println("Rectangle draw methods ........."));
	}
	private static void callingMethods(ShapeSize shapeSize) {
		shapeSize.draw();
	}

}
