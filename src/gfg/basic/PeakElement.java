/**
 * 
 */
package gfg.basic;

import java.util.Scanner;

/**
 * gfg.basic
 *DelL
 */
public class PeakElement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int num=scanner.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the element of the array:");
		for(int i=0;i<num;i++)
		{
			arr[i]=scanner.nextInt();
		}
		int peakIndex= peakelemet(arr,num);
		System.out.println("peak element at index "+peakIndex);
	}

	/**
	 * @param arr
	 * @param num
	 * @return
	 */
	private static int peakelemet(int[] arr, int num) {
//		int max=Integer.MIN_VALUE;
		int max=0;
//		int id=-1;
		int id=0;
		for(int i=0;i<num;i++)
		{
			if (arr[i]>max) {
				max=arr[i];
				id=i;
			}
		}
		return  id;
	}

}
