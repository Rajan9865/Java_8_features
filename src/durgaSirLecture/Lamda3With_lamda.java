/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7
 *11:56:46 pm
 *2023
 *Java_8_Features_examples
 *TODO
 */
interface Interf2
{
	public void sum(int a,int b);
}

public class Lamda3With_lamda {
public static void main(String[] args) {
	Interf2 interf2=(a,b)->System.out.println("the sum:"+(a+b));
	interf2.sum(10, 50);
}
}
