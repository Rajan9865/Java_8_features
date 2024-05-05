/**
 * 
 */
package gfgschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * gfgschool
 *DelL
 */
public class Value_equal_toindex_value {
	public static void main(String[] args) {
		Value_equal_toindex_value value_equal_toindex_value=new Value_equal_toindex_value();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the size of array: ");
			int size=scanner.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the element of tha array:");
			for(int i=0;i<size;i++)
			{
				arr[i]=scanner.nextInt();
			}
			List<Integer>result=value_equal_toindex_value.valueEqualToIndex(arr,size);
			System.out.println("Indices where values are equal to index: " + result);
		}
	}

	/**
	 * @param arr
	 * @param size
	 * @return
	 */
	private List<Integer> valueEqualToIndex(int[] arr, int size) {
		List<Integer>result=new ArrayList<>();
		for(int i=0;i<size;i++)
		{
			if (arr[i]==i+1) {
				result.add(i+1);
			}
		}
		return result;
	}
}
