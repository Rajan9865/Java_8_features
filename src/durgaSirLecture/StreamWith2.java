/**
 * 
 */
package durgaSirLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author deby7 7:06:06 am 2023 Java_8_Features_examples TODO
 */
public class StreamWith2 {
	public static void main(String[] args) {
		ArrayList<String>l1=new ArrayList<String>();
		l1.add("rvk");
		l1.add("gugjh");
		l1.add("nsn");
		l1.add("kjdf");
		l1.add("bjsd");
		l1.add("jhk");
		l1.add("kjl");
		System.out.println(l1);
		
		System.out.println("******* Upper case ********");
		List<String>l2=l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		System.out.println("******** length Count*****");
		long count=l1.stream().filter(s->s.length()==4).count();
		System.out.println(count);
		
		System.out.println("*********according to defaultt natural sorted ****");
		List<String>l3=l1.stream().sorted().collect(Collectors.toList());
		System.out.println("according to defaultt natural sorted "+l3);
		
		System.out.println("******* According to customize order********");
		List<String>l4=l1.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("According to customize order:"+l4);
		
		
	}
}
