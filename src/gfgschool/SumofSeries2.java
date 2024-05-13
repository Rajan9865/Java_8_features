/**
 * 
 */
package gfgschool;

import java.util.Scanner;

/**
 * gfgschool
 *DelL
 */
public class SumofSeries2 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the number:");
			int num=scanner.nextInt();
			long result=SumofSeries(num);
			System.out.println("Sum of the series "+num+" : "+result);
		}
	}

	/**
	 * @param num
	 * @return
	 */
	private static long SumofSeries(int num) {
	long sum=((long)num)*((long)(num+1))/2;
	return sum;
	}

}
