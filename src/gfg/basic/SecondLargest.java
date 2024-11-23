/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class SecondLargest {
	public static void main(String[] args) {
		int[] test1 = { 10, 20, 30, 40 };
		int[] test2 = { 10, 10, 10 };
		int[] test3 = { 5 };
		int[] test4 = { 20, 20, 10 };
		int[] test5 = { 3, 2, 1 };
		int result= getSecondLargest(test1);
		System.out.println(result);
	}

	/**
	 * @param test1
	 * @return
	 */
	private static int getSecondLargest(int[] test1) {
		if (test1==null||test1.length<2) {
			return -1;
		}
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for (int num : test1) {
			if (num>largest) {
				secondLargest=largest;
				largest=num;
			}
			else if (num>secondLargest&&num!=largest) {
				secondLargest=num;
			}
		}
		return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
	}

}
