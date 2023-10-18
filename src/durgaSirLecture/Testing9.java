/**
 * 
 */
package durgaSirLecture;

/**
 * @author deby7 7:43:47 am 2023 Java_8_Features_examples TODO
 */
class Example12
{
	private String string;
	Example12(String string)
	{
		this.string=string;
		System.out.println("Constructor executed :"+string);
	}
}
interface Example11
{
	public Example12 get(String string);
}
public class Testing9 {
	public static void main(String[] args) {
		Example11 example11= string->Example12(string);
		
	}

}
