/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 5:42:47 pm 2023 Java_8_Features_examples TODO
 */
class MyRunnable implements Runnable
{
	public void main()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class WithoutLamdaFunction4 {
	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			Thread t=new Thread(runnable);
			t.start
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
