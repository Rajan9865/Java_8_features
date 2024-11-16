/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *@author Rajan kumar
 */

class Animal1
{
	private String sound="generic animal sounds";
	public String getSound()
	{
		return sound;
	}
	/**
	 * 
	 */
	void sound() {
		// TODO Auto-generated method stub
		
	}
}
class Dog3 extends Animal1
{
	private String sound="Bark";
	public String getSound()
	{
		return sound;
	}
}
public class Main5 {
	public static void main(String[] args) {
		Animal1 animal1=new Dog3();
	//	animal1.getSound();
		System.out.println(animal1.getSound());
	}

}
