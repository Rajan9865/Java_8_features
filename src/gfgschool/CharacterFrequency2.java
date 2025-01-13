/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class CharacterFrequency2 {
	public static void main(String[] args) {
		String input="programming";
		findOccurence(input);
	}
	private static void findOccurence(String input) {
		int[] freq=new int[26];
		for (char ch: input.toCharArray()) {
			freq[ch-'a']++;
		}
		System.out.println("frequency count:");
		for(char ch='a';ch<='z';ch++)
		{
			if (freq[ch-'a']>0) {
				System.out.print(ch+""+freq[ch-'a']);
			}
		}
	}
}
