/**
 * 
 */
package gfgschool;

import java.util.Scanner;

/**
 * gfgschool
 *DelL
 */
public class SumofSeries1 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the number ::");
			int num=scanner.nextInt();
			long result=seriesSum(num);
			System.out.println("Sum of the series up to "+ num +":"+result);
		}
	}

	/**
	 * @param num
	 * @return
	 */
	private static long seriesSum(long num) {
		long sum=0;
		for(long i=1;i<=num;i++)
		{
			sum+=i;
		}
		return sum;
	}


}
