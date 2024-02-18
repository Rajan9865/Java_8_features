/**
 * 
 */
package java_guide;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author deby7
 *9:10:08 am
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class StreamExample1 {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("Java Guides", "Python Guides", "C Guides");
//		boolean anyMatch=list.stream(). anyMatch(s->s.startsWith("Java"));
//		boolean anyMatch=list.stream().anyMatch(s->s.toLowerCase().contains'("e"));
		boolean anyMatch=list.stream().anyMatch(s->s.equalsIgnoreCase("Java Guides"));
		System.out.println(anyMatch);
		System.out.println("*********************************");
//		boolean allMatch=list.stream().allMatch(s->s.equalsIgnoreCase("Guides"));
//		boolean allMatch = list.stream().a	llMatch((value) -> { return value.contains("Guides"); });
		boolean allMatch=list.stream().allMatch(s->
		{
			return s.contains("Guides");
		}
				);
		System.out.println(allMatch);
		System.out.println("************////////////");
		List<String>list2=Arrays.asList("rajan","shivam");
		boolean nonMatch=list2.stream().noneMatch((s)->
		{
//			return s.contains("rddajan");//true if not matched
			return s.contains("rajan");// if match then false
			
		});
		System.out.println(nonMatch);
		System.out.println("*******************''");
		List<String>list3=Arrays.asList("one","two","three","four","five");
		List<String> uppercaseList = list3.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercaseList);
		System.out.println("collect use *********");
		
		System.out.println("******************");
		System.out.println("Count element 2nd approach");
		Integer countElement=(int) list3.stream().map(s->s.toUpperCase()).count();
		System.out.println(countElement);
				
		System.out.println("******** any match");
		Optional<String> anyElementString =list3.stream().findAny();
		System.out.println(anyElementString);
		
		System.out.println("************ find first");
		Optional<String> findFirString=list3.stream().findFirst();
		System.out.println(findFirString);
		
		System.out.println("******* for each*****");
		list3.stream().forEach(s->{
			System.out.println(s);
		});
		
		System.out.println("*********** min valuse");
		Optional<String> minValue = list3.stream().min((val1, val2) -> {
			return val1.compareTo(val2);
		});
		System.out.println(minValue);
		
		System.out.println("*********** min valuse 2nd approach");
		Optional<String> minString2=list3.stream().min((val1,val2)->val1.compareTo(val2));
		System.out.println(minString2);
		System.out.println("*********** min valuse 3rd approach");
		Optional<String> minString3=list3.stream().min(String::compareTo);
		System.out.println(minString3);
		
		System.out.println("********* max value 1st apporach " );
		Optional<String> maxvalueString=list3.stream().max((m,n)->m.compareTo(n));
		System.out.println(maxvalueString);
		
		System.out.println("********* max value 2nd apporach " );
		Optional<String> maxvalueString2=list3.stream().max(String::compareToIgnoreCase);
		System.out.println(maxvalueString2.get());
		
		System.out.println("**  reduce methods ******");
		Optional<String> reducevalueString=list.stream().reduce((val1,val2)->val1+"+"+val2);
		System.out.println(reducevalueString.get());
		
		
		
		
		
		
		
		
	}
}
