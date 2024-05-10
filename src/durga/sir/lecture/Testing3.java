/**
 * 
 */
package durga.sir.lecture;

/**
 * @author deby7 7:15:52 am 2023 Java_8_Features_examples TODO
 */
public class Testing3 {
public static void main(String[] args) {
	Runnable runnable =()->
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child Thread");
		}
	};
	Thread thread=new Thread(runnable);
	thread.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("Main thread");
	}
}
}
