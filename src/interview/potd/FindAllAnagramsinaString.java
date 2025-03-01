/**
 * 
 */
package interview.potd;

import java.util.ArrayList;
import java.util.List;

/**
 * interview.potd
 *@author Rajan kumar
 */
public class FindAllAnagramsinaString {
	public static void main(String[] args) {
//		String txt = "forxxorfxdofr";
		String txt = "cbaebabacd";
//		String pat = "for";
		String pat = "abc";

		List<Integer> result = countAnagrams(txt, pat);
		System.out.println("Number of anagrams of pat in txt: " + result);
	}

	/**
	 * @param txt
	 * @param pat
	 * @return
	 */
	private static List<Integer> countAnagrams(String txt, String pat) {
		int k=pat.length();
		int[] count=new int[26];
		for(char ch:pat.toCharArray()) {
			count[ch-'a']++;
		}
		int i=0;
		int j=0;
		int n=txt.length();
		List<Integer>result=new ArrayList<>();
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
		for(int c:count) {
			if (c!=0) {
				return false;
			}
		}
		return true;
	}

}
