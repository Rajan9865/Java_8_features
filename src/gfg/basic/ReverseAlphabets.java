/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class ReverseAlphabets {
	public static void main(String[] args) {
		String s = "34test909gda@sdet!23pro";
		System.out.println("orignal string :"+s);
		char[] chars=s.toCharArray();
		int left=0;
		int end=chars.length-1;
		while (left<end) {
			while (left<end&&!Character.isLetter(chars[left])) {
				left++;
			}
			while (left<end&&!Character.isLetter(chars[end])) {
				end--;
			}
			if (left<end) {
				char temp=chars[left];
				chars[left]=chars[end];
				chars[end]=temp;
				left++;
				end--;
			}
		}
		String string=new String(chars);
		System.out.println("reverse strign :"+string);
		
	}

}
