/**
 * 
 */
package java_guide;

/**
 * @author deby7
 *6:38:34 am
 *2024
 *Java_8_Features_examples
 *TODO
 */
interface Shape3
{
	void draw();
}
public class LamdbaExample3 {
	public static void main(String[] args) {
		Shape3 shape3=()->System.out.println("drwaw methodss");
		shape3.draw();
	}
}
