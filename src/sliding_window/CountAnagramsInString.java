/**
 * 
 */
package sliding_window;

import java.util.List;

/**
 * sliding_window
 * 
 * @author Rajan kumar
 */
public class CountAnagramsInString {
	public static void main(String[] args) {
		String txt = "cbaebabacd";
		String pat = "abc";

		List<Integer> result = countAnagrams(txt, pat);
		System.out.println("Number of anagrams of pat in txt: " + result);
	}
}
