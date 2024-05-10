/**
 * 
 */
package durga.sir.lecture;

/**
 * @author deby7 11:56:57 pm 2023 Java_8_Features_examples TODO
 */
interface Testing4 {
	/*
	 * public static void sum(int a, int b) {
	 * System.out.println("The sum of :"+(a+b)); }
	 */
	public static void minus(int a, int b) {
		System.out.println("the substraction is :" + (a - b));
	}
}

class Test implements Testing4 {
	public static void minus(int a, int b) {
		System.out.println("the substraction is :" + (a - b));
	}
}

public class StaticMethods1 implements Testing4 {
	public static void main(String[] args) {
		/*
		 * StaticMethods1 staticMethods1=new StaticMethods1(); //
		 * staticMethods1.sum(10,20)// compilations error Testing4.sum(10, 20);
		 */StaticMethods1 staticMethods1=new StaticMethods1();
		 Testing4.minus(10, 5);
		 Test.minus(15, 5);
	}

}
