/**
 * 
 */
package gfgschool;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

/**
 * gfgschool DelL
 */
public class SumofSeries3 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter the  no");
			int num = scanner.nextInt();
			long results= sumOfSeries4(num);
			System.out.println("sum  "+results);
			System.out.println("formula use for sum............");
			long sum1=num*(num+1)/2;
			System.out.println(sum1);
		}
	}

	/**
	 * @param num
	 * @return 
	 */
	private static long sumOfSeries4(int num) {
		long sum=0;
		for(int i=1;i<=num;i++)
		{
			 sum+=i;
		}
		return sum;
	}
}
