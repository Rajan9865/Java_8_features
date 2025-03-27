/**
 * 
 */
package gfg.basic;

import java.util.Arrays;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class MoveZeroesToRight {
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12, 0, 5};

        moveZeroesToRight(arr);
//        System.out.println("Array after moving zeroes to the right: " + Arrays.toString(arr));
        printArray(arr);

	}

	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

	/**
	 * @param arr
	 */
	private static void moveZeroesToRight(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
	}

}
