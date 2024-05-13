/**
 * 
 */
package durga.sir.lecture;

/**
 * @author deby7 7:27:50 am 2023 Java_8_Features_examples TODO
 */
interface Example10
{
	public void m1(int i);
}
public class Testing8 {
	public void m2(int i)
	{
		System.out.println("From methods references "+i);
	}
	public static void main(String[] args) {
		Example10 example10=(int i)->System.out.println("From lamdba Expression"+i);
		example10.m1(10);
		Testing8 testing8=new Testing8();
		Example10 example=testing8::m2;
		example.m1(20);
				
	}

}
