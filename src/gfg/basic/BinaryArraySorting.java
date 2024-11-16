/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class BinaryArraySorting {
public static void main(String[] args) {
	int[] arr= {0,1,0,1,0,0,1,1,1,0,0,0,1,0,1,1};
	System.out.println("proginala array ");
	printArray(arr);
	binSort(arr);
	System.out.println("sorted array print :");
	printArray(arr);
	
}

/**
 * @param arr
 */
private static void binSort(int[] arr) {
	int left=0;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==0) {
			int temp=arr[i];
			arr[i]=arr[left];
			arr[left]=temp;
			left++;
		}
	}
}

/**
 * @param arr
 */
private static void printArray(int[] arr) {
	for (int num : arr) {
		System.out.print(num + " ");
	}
	System.out.println();
}
}
