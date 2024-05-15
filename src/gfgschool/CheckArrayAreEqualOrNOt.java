/**
 * 
 */
package gfgschool;

import java.util.Arrays;
import java.util.Scanner;

/**
 * gfgschool
 *DelL
 */
public class CheckArrayAreEqualOrNOt {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the size of the array :");
			int num=scanner.nextInt();
			long[] A= new long[num];
			System.out.println("Enter the element of array A :");
			for(int i=0;i<num;i++)
			{
				A[i]=scanner.nextLong();
			}
			long[] B=new long[num];
			System.out.println("Enter the element of array B :");
			for(int i=0;i<num;i++)
			{
				B[i]=scanner.nextLong();
			}
			boolean result=check(A,B,num);
			if (result) {
				System.out.println("Array are equal:");
			} else {
				System.out.println("Array are not equal :");
			}
		}
	}

	/**
	 * @param a
	 * @param b
	 * @param num
	 * @return
	 */
	private static boolean check(long[] a, long[] b, int num) {
		if (a.length!=b.length) {
			return false;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<num;i++)
		{
			if (a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}

}
