/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class CharacterFrequency3 {
	public static void main(String[] args) {
		String input="programming";
		findOccurence(input);
	}
	private static void findOccurence(String input) {
		int[] freq=new int[256];
		for(char ch:input.toCharArray())
		{
			freq[ch]++;
		}
		for (char ch=0;ch<256;ch++) {
			if (freq[ch]>0) {
				System.out.println((char)ch+" "+freq[ch]);
			}
		}
	}
}
