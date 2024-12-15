/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class CharacterOccurrenceWithoutMap {
	public static void main(String[] args) {
		String input = "occurrence";
		countCharacterOccurrences(input);
	}

	/**
	 * @param input
	 */
	private static void countCharacterOccurrences(String input) {
		String lowerCase = input.toLowerCase();
		int[] freq = new int[256];
		boolean[] visited=new boolean[256];
		for (char iterable_element : lowerCase.toCharArray()) {
			freq[iterable_element]++;
		}
//		for (int i = 0; i < freq.length; i++) {
//			if (freq[i] > 0) {
//				System.out.println((char) i + ": " + freq[i]);
//			}
//		} 
		for (char i : lowerCase.toCharArray()) {
			if (!visited[i]) {
				System.out.print(i+""+freq[i]);
				visited[i]=true;
			}
		}
	}
}
