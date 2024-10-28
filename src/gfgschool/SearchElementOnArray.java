/**
 * 
 */
package gfgschool;

import java.util.Scanner;

/**
 * gfgschool
 *DelL
 */
public class SearchElementOnArray {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the size of array :");
			int num=scanner.nextInt();
			int[] arr=new int[num];
			System.out.println("enter the element of the array::");
			for(int i=0;i<num;i++)
			{
				arr[i]=scanner.nextInt();
			}
			System.out.println("Enter the element for search ::");
			int x=scanner.nextInt();
			int result=searchElement(arr,num,x);
			if (result!=-1) {
				System.out.println("element found at index :"+result);
			} else {
				System.out.println("element not found in array : ");
			}
		}
	}

	/**
	 * @param arr
	 * @param num
	 * @param x
	 * @return
	 */
	private static int searchElement(int[] arr, int num, int x) {
		for(int i=0;i<num;i++)
		{
			if (arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
}
