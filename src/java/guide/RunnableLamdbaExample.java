/**
 * 
 */
package java.guide;

/**
 * @author deby7
 *8:49:59 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */
class ThreadDemo implements Runnable
{

	@Override
	public void run() {
		System.out.println("Run methods called ..........");
	}
	
}
public class RunnableLamdbaExample {
	public static void main(String[] args) {
		/*
		Thread thread=new Thread(new ThreadDemo());
		thread.start();
		Runnable runnable=()-> System.out.println("run methods called using lamdba .....");
		Thread threadLamdba=new Thread(runnable);
		threadLamdba.start();
		*/
		Thread thread=new Thread(new ThreadDemo());
		thread.start();
		Thread threadLamdba=new Thread(()-> System.out.println("run methods called using lamdba ...."));
		threadLamdba.start();
	}

}
