/**
 * 
 */
package durga.sir.lecture;

/**
 * @author deby7 5:42:47 pm 2023 Java_8_Features_examples TODO
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Your actual logic for the thread goes here
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class WithoutLambdaFunction4 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        // Create a thread using the MyRunnable instance
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        // Main thread's logic
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

