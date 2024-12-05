/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class AnagramofString {
	public static void main(String[] args) {
//		String s1 = "bcadeh";
		String s1 = "triangle";
//		String s2 = "hea";
		String s2 = "integral";
		System.out.println("Deletions needed: " + remAnagrams(s1, s2));
		System.out.println("return  valid anagrams return only true false");
		System.out.println("***************");
		System.out.println(" can be made anagram :: " + canBeAnagrams(s1, s2));
		System.out.println("***********  Ananagram of Strings *************");
		System.out.println(areAnagram(s1,s2));
	}

	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static int areAnagram(String s1, String s2) {
		if (s1.length()!=s2.length()) {
			return 0;
		}
		int[] freq=new int[26];
		for (char i : s1.toCharArray()) {
			freq[i-'a']++;
			System.out.print(" "+i);
		}
		System.out.println("************");
		for (char i : s2.toCharArray()) {
			freq[i-'a']--;
			
			System.out.print(" "+i);
		}
		for (int count : freq) {
			System.out.print(" "+count);
			if (count!=0) {
				return 0;
			}
		}
		return 1;
	}

	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static boolean canBeAnagrams(String s1, String s2) {
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		for (char i : s1.toCharArray()) {
			freq1[i - 'a']++;
		}
		for (char i : s2.toCharArray()) {
			freq2[i - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			if (Math.abs(freq1[i] - freq2[i]) > 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static int remAnagrams(String s1, String s2) {
		int[] freq1 = new int[26];
		int[] freq2 = new int[26];
		for (char c : s1.toCharArray()) {
			freq1[c - 'a']++;
		}
		for (char c : s2.toCharArray()) {
			freq2[c - 'a']++;
		}
		int deletations = 0;
		for (int i = 0; i < 26; i++) {
			deletations += Math.abs(freq1[i] - freq2[i]);
		}
		return deletations;
	}

}
