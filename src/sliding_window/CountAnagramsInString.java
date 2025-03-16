/**
 * 
 */
package sliding_window;

import java.util.ArrayList;
import java.util.List;

/**
 * sliding_window
 * 
 * @author Rajan kumar
 */
public class CountAnagramsInString {
	public static void main(String[] args) {
//		String txt = "cbaebabacd";
		String txt = "aabaabaa";
//		String pat = "abc";
		String pat = "aaba";

		List<Integer> result = countAnagrams(txt, pat);
		System.out.println("Number of anagrams of pat in txt: " + result);
	}
	private static List<Integer> countAnagrams(String txt, String pat) {
		List<Integer>result=new ArrayList<>();
		int k=pat.length();
		int[] count=new int[26];
		for(char ch:pat.toCharArray()) {
			count[ch-'a']++;
		}
		int i=0;
		int j=0;
		int n=txt.length();
		while (j<n) {
			int idx=txt.charAt(j)-'a';
			count[idx]--;
			if (j-i+1==k) {
				if (allZero(count)) {
					result.add(i);
				}
				count[txt.charAt(i)-'a']++;
				i++;
			}
			j++;
		}
		return result;
		
	}
	/**
	 * @param count
	 * @return
	 */
	private static boolean allZero(int[] count) {
		for(int num:count) {
			if (num!=0) {
				return false;
			}
		}
		return true;
	}
}
