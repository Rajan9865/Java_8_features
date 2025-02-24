/**
 * 
 */
package gfgschool;

import java.util.ArrayList;
import java.util.List;

/**
 * gfgschool
 * 
 * @author Rajan kumar
 */
public class FirstOccurrence {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 7, 3, 8, 3 };
//		int target = 3;
		int target=13;
		char[] input= {'a', 'e', 'i', 'o', 'u'};
		char targetArray='o';
		System.out.println("first occuren at index " + firstOccurrence(arr, target));
		System.out.println("last occuren at index " + lastOccurrence(arr, target));
		System.out.println("2nd way to find last occuren at index " + lastOccurrence1(arr, target));
		System.out.println("occurence of " +target+ ": "+ occurenceCount(arr, target));
		System.out.println("character found "+characterFound(input,targetArray));
		System.out.println("element found at index "+multipleElementFound(arr,target));
		System.out.println("Element exist "+elementExistOrNot(arr,target));
		System.out.println("Maximum element "+findMaximumElement(arr));
		System.out.println("minimum element "+findMinimunElement(arr));
		System.out.println("find occurence from last "+reverse(arr,target));
	}
	private static int reverse(int[] arr, int target) {
		for(int i=arr.length-1;i>=0;i--) {
			if (arr[i]==target) {
				return i;
			}
		}return -1;
	}
	private static int findMinimunElement(int[] arr) {
		int min=arr[0];
		for(int num:arr) {
			if (num<min) {
				min=num;
			}
		}return min;
	}
	private static int findMaximumElement(int[] arr) {
		int max=arr[0];
		for(int num:arr) {
			if (num>max) {
				max=num;
			}
		}
		return max;
	}
	private static boolean elementExistOrNot(int[] arr, int target) {
		for(int num:arr)
		{
			if (num==target) {
				return true;
			}
		}
		return false;
	}
	private static List<Integer> multipleElementFound(int[] arr, int target) {
		List<Integer>numIntegers=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==target) {
				numIntegers.add(i);
			}
		}
		return numIntegers;
	}
	private static boolean characterFound(char[] input, char targetArray) {
		for(char ch:input) {
			if (ch==targetArray) {
				return true;
			}
		}
		return false;
	}
	private static int occurenceCount(int[] arr, int target) {
		int count=0;
		for(int num:arr) {
			if (num==target) {
				count++;
			}
		}
		return count;
	}

	private static int lastOccurrence1(int[] arr, int target) {
		int lastIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}

	private static int lastOccurrence(int[] arr, int target) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	private static int firstOccurrence(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
