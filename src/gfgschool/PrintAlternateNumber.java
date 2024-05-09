/**
 * 
 */
package gfgschool;

import java.util.Iterator;
import java.util.Scanner;

/**
 * gfgschool
 *DelL
 */
public class PrintAlternateNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int num=scanner.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the element of the array:");
		for(int i=0;i<num;i++)
		{
			arr[i]=scanner.nextInt();
		}
		System.out.println("printint alternate number::");
		PrintAlternateNumber.print(arr,num);
	}

	/**
	 * @param arr
	 * @param num
	 */
	private static void print(int[] arr, int num) {
		for(int i=0;i<num;i+=2)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
