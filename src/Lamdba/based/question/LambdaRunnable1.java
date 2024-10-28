/**
 * 
 */
package Lamdba.based.question;

/**
 * Lamdba.based.question
 *DelL
 */
public class LambdaRunnable1 {
	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("runnable using anonymous class");
			}
		};
		Runnable runnable2=()->System.out.println("runnable using lamdba expression");
		runnable.run();
		runnable2.run();
	}

}
