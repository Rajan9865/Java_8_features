/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *@author Rajan kumar
 */
abstract class Shape
{
	abstract void draw();
	void show()
	{
		System.out.println("showing shape");
	}
}
class Circle extends Shape
{

	@Override
	void draw() {
		System.out.println("drawing circle");
		
	}
}
public class Main10 {
public static void main(String[] args) {
//	Shape shape=new Circle();
	Shape shape=new Shape() {
		
//		@Override
//		void draw() {
//			
//		}
	};
	shape.show();
}
}
