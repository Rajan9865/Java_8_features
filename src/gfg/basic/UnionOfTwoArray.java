/**
 * 
 */
package gfg.basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * gfg.basic
 *DelL
 */
public class UnionOfTwoArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of array a[]:");
		int num1=scanner.nextInt();
		int a[]=new int[num1];
		System.out.println(" enter element of arrays a[]: ");
		for(int i=0;i<num1;i++)
		{
			a[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the size of array b[]:");
		int num2=scanner.nextInt();
		int b[]=new int[num2];
		System.out.println(" enter element of arrays b[]: ");
		for(int i=0;i<num2;i++)
		{
			b[i]=scanner.nextInt();
		}
		int unionSize=doUnion(a,num1,b,num2);
		System.out.println(" no of element in union :"+unionSize);
	}

	/**
	 * @param a
	 * @param num1
	 * @param b
	 * @param num2
	 * @return
	 */
	private static int doUnion(int[] a, int num1, int[] b, int num2) {
		Set<Integer>unionSet=new HashSet<>();
		for(int i=0;i<num1;i++)
		{
			unionSet.add(a[i]);
		}
		
		for(int i=0;i<num2;i++)
		{
			unionSet.add(b[i]);
		}
		return unionSet.size();
	}

}
