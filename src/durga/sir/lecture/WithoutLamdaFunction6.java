/**
 * 
 */
package durga.sir.lecture;

/**
 * @author deby7 6:07:10 pm 2023 Java_8_Features_examples
 */
public class WithoutLamdaFunction6 {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		});
		thread.start();
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Main Thread");
			}
		}
	}

}
