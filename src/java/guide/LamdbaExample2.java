/**
 * 
 */
package java.guide;

/**
 * @author deby7
 *6:25:50 am
 *2024
 *Java_8_Features_examples
 *TODO
 */
// traditional methods 
interface Shape2
{
	void draw();
}
class TEst implements Shape2
{

	@Override
	public void draw() {
		System.out.println("test methods");
	}
	
}
public class LamdbaExample2 {
	public static void main(String[] args) {
		/*
		Shape2 shape2=new TEst();
		shape2.draw();
		*/
		TEst tEst=new TEst();
		tEst.draw();
	}
}
