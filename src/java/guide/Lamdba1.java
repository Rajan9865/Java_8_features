/**
 * 
 */
package java.guide;

/**
 * @author deby7
 *7:32:25 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */



interface Shape {
	void draw();
}
/*
 * @responsible  this is traditional methods in java 8 we can remove this implementations
 * then also working as excepted
 * 
class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println(" Rectangle class :: draw ()method");
	}
}
class Square implements Shape{

	@Override
	public void draw() {
		System.out.println(" square class :: draw ()method");
	}
}
class Circle implements Shape
{
	@Override
	public void draw() {
		System.out.println(" Circle class :: draw ()method");
	}
}
*/
public class Lamdba1 {
	public static void main(String[] args) {
		/*
		Shape rectangle = () -> System.out.println(" Rectangle class :: draw ()method");
//		rectangle.draw();
		Shape square = () -> {
			System.out.println(" square class :: draw ()method");
		};
//		square.draw();
		Shape circle = () -> {
			System.out.println(" Circle class :: draw ()method");
		};
		*/
		
//		circle.draw();
		/*
		print(circle);
		print(rectangle);
		print(square);
		*/
		print(() -> System.out.println(" Rectangle class :: draw ()method"));
		print(() -> System.out.println(" square class :: draw ()method"));
		print(() -> {
			System.out.println(" Circle class :: draw ()method");
		});
	}
		
	private static  void print(Shape shape) {
		shape.draw();
	}
}
