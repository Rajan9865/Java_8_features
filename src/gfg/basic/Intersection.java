/**
 * 
 */
package gfg.basic;

import java.util.HashSet;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class Intersection {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 7, 9 };
		int[] arr2 = { 2, 3, 5, 7, 8 };
		int target=4;
		System.out.println("original Arr1");
		printArray(arr1);
		System.out.println("original Arr2");
		printArray(arr1);
		System.out.println("*********** union *******");
		findUnion(arr1,arr2);
		System.out.println("intersection of two array");
		intersection(arr1, arr2);
		System.out.println("SearchLargeDataset  problem *****");
		System.out.println("element found "+searchStream(arr1,target));
	}


	/**
	 * @param arr1
	 * @param target
	 */
	private static boolean searchStream(int[] arr1, int target) {
		for(int num:arr1) {
			if (num==target) {
				return true;
			}
		}
		return false;
	}


	/**
	 * @param arr1
	 * @param arr2
	 */
	private static void findUnion(int[] arr1, int[] arr2) {
		HashSet<Integer>hashSet=new HashSet<>();
		for(int num:arr1) {
			hashSet.add(num);
		}
		for(int num:arr2) {
			hashSet.add(num);
		}
		System.out.println(hashSet);
	}

	/**
	 * @param arr1
	 */
	private static void printArray(int[] arr1) {
		for (int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	/**
	 * @param arr1
	 * @param arr2
	 */
	private static void intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int num : arr1) {
			hashSet.add(num);
		}
		for (int num : arr2) {
			if (hashSet.contains(num)) {
				System.err.print(num + " ");
			}
		}
	}
}
