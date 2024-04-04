/**
 * 
 */
package gfgschool;

import java.util.Scanner;

/**
 * gfgschool DelL
 */
public class SumofSeries {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double doubleValue=0;
		boolean validInput=false;
		while (!validInput) {
			System.out.println("enter a no:");
			if (scanner.hasNextDouble()) {
				doubleValue=scanner.nextDouble();
				if (doubleValue<0) {
					System.out.println("plz enter positive number::"+doubleValue);
				} else {
					validInput=true;
				}
			}
			else {
				String input=scanner.next();
				System.out.println("Invalid input: \"" + input + "\". Please enter a valid number.");
			}
			}
		System.out.println("you entered a double "+doubleValue);
			double sum = seriesSum(doubleValue);
			System.out.println("sumof series :"+sum);
		}

	/**
	 * @param n
	 * @return
	 */
	private static double seriesSum(double n) {
		double sum=(n)*(n+1)/2;
		return sum;
	}
}
