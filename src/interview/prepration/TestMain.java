/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration DelL
 */
class Dog {
    protected void speak() {
        System.out.println("woof woof");
    }
}

interface AnimalLanguage {
    default void speak() {
        System.out.println("Bark bark woof woof");
    }
}

class Billi extends Dog implements AnimalLanguage {
        // Calls the speak method from Dog class
//        super.speak(); // You can also call the default method using speak() if you want to use the interface's version.
    	
    	 @Override
    	    public void speak() {
    	        // You can call either the Dog's method or the interface's method here
    	        // super.speak(); // Calls Dog's speak
    	        AnimalLanguage.super.speak(); // Calls the interface's speak
    	    }

    	    public void communicate() {
    	        speak();
    	    }
}

public class TestMain {
    public static void main(String[] args) {
        Billi myBilli = new Billi();
        myBilli.communicate();
    }
}
