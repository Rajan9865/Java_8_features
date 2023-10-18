/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 5:57:37 pm 2023 Java_8_Features_examples TODO
 */
public class WithoutLamdaFunction5 {
	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("Child Thread");
				}
			}
		});
		thread.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
