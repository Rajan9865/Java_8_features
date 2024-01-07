/**
 * 
 */
package java_guide;

/**
 * @author deby7 8:22:54 pm 2024 Java_8_Features_examples TODO
 */
interface Addable {
	int addition(int a, int b);
}

class AddableImpl implements Addable {

	@Override
	public int addition(int a, int b) {
		return (a+b);
	}

}

public class LamdbaParameter {
	public static void main(String[] args) {
		/*
		Addable addition=(int a, int b) ->{
			return (a+b);
		};
		int result=addition.addition(10, 20);
		System.out.println(result);
		*/
		
		/*
		Addable addition=(a,b)->(a+b);
		int result=addition.addition(10, 20);
		System.out.println(result);
		*/
		Addable addition=(a,b)->
		{
			int c=	(a+b);
			return c;
		};
		System.out.println(addition);
	}

}
