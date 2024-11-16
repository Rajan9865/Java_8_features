/**
 * 
 */
package interview.prepration;

/**
 * interview.prepration
 *@author Rajan kumar
 */
class Animal3 {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog4 extends Animal3 {
    @Override
    void sound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Dog fetching...");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Animal3 a = new Dog4();
//    	Dog4 a = new Dog4();
        a.sound();
//        a.fetch();
//        ((Dog) a).fetch();

        // Uncommenting the following line will cause a compilation error:
        // a.fetch();
    }
}

