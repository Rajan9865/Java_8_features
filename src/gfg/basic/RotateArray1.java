/**
 * 
 */
package gfg.basic;

import java.util.Arrays;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class RotateArray1 {
	public static void main(String[] args) {
		int[] arr={1, 2, 3, 4};
		int d=6;
		System.out.println("Original array ::");
		printArray(arr);
		System.out.println();
		System.out.println("reverse array");
		int[] rotatearray=new int[arr.length];
		int index=0;
		for (int i=d;i<arr.length;i++) {
			rotatearray[index++]=arr[i];
		}
		for (int i = 0; i < d; i++) {
			rotatearray[index++]=arr[i];
		}
		System.out.println(Arrays.toString(rotatearray));
		
	}

	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		Arrays.stream(arr).forEach(num->System.out.print(num+" "));
	}
}
