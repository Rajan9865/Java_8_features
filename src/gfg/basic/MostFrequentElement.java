/**
 * 
 */
package gfg.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class MostFrequentElement {
	public static void main(String[] args) {
		int[] arr= {4, 5, 6, 7, 4, 6, 4};
		System.out.println("most frequent element "+mostFrequentElement(arr));
	}
	private static int mostFrequentElement(int[] arr) {
		Map<Integer, Integer>hashMap=new HashMap<>();
		int maxFreq = 0;
		int mostFreqElement = arr[0];
		for(int num:arr) {
			hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
			if (hashMap.get(num)>maxFreq) {
				maxFreq=hashMap.get(num);
				mostFreqElement=num;
			}
		}
		return mostFreqElement;
	}
}
