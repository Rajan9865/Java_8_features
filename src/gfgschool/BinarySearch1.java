/**
 * 
 */
package gfgschool;

import java.util.Arrays;

/**
 * gfgschool
 *@author Rajan kumar
 */
public class BinarySearch1 {
	public static void main(String[] args) {
		int[] input= {12, 3, 9, 1, 15, 7};
//		int target=7;
		int target=151;
		int result=binarySearchalgorithm(input,target);
		if (result!=-1) {
			System.out.println("element flound at index "+result);
		}else {
			System.out.println(" not found element");
		}
	}
	private static int binarySearchalgorithm(int[] input, int target) {
		int start=0,end=input.length-1;
		Arrays.sort(input);
		while(start<=end)
		{
			int middle=(start+end)/2;
			if (input[middle]==target) {
				return middle;
			}else if (input[middle]>target) {
				end=middle-1;
			}else {
				start=middle+1;
			}
		}
		return -1;
	}
}
