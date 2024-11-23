/**
 * 
 */
package gfg.basic;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * gfg.basic
 * .
 * @author Rajan kumar
 */
public class WordOccurrences {
	public static void main(String[] args) {
		String s = "This is a test, test sentence to find, find a repetitive words. repetitive words!";
		s.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
		System.out.println("string ::-"+s);
		String[] awords=s.split("\\s+");
		System.out.println("string of array ::-"+awords.toString());
//		Map<String, Long>wordCount= Arrays.stream(awords).collect(Collectors.groupingBy(awords->awords,Collectors.counting()));
		Map<String, Long> wordCount = Arrays.stream(awords)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
//		System.out.println(awords);
		wordCount.forEach((word,cound)->System.out.println(word+": "+cound));
	}

}
