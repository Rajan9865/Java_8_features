/**
 * 
 */
package durga.sir.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 7:00:01 am 2023 Java_8_Features_examples TODO
 */
public class StreamWith1 {
public static void main(String[] args) {
	ArrayList<Integer>l1=new ArrayList<Integer>();
	for(int i=0;i<10;i++)
	{
		l1.add(i);
	}
	System.out.println(l1);
	List<Integer>l2=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l2);
}
}
