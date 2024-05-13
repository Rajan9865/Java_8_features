/**
 * 
 */
package durga.sir.lecture;

import java.util.ArrayList;

/**
 * @author deby7 6:40:49 am 2023 Java_8_Features_examples TODO
 */
public class StreamWithout1 {
	public static void main(String[] args) {
		ArrayList<Integer>l1=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			l1.add(i);
		}
		System.out.println(l1);
		ArrayList<Integer>l2=new ArrayList<Integer>();
		for(Integer i:l1)
		{
			if (i%2==0) {
				l2.add(i);
			}
		}
		System.out.println(l2);
	}

}
