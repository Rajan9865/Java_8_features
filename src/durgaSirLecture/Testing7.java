/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 7:22:11 am 2023 Java_8_Features_examples TODO
 */
public class Testing7 {
	public static void m1()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		Runnable runnable=Testing7::m1;
		Thread thread=new Thread(runnable);
		thread.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
