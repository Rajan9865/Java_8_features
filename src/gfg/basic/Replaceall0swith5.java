/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class Replaceall0swith5 {
	public static void main(String[] args) {
		int test1 = 1004;
		int test2 = 0;
		int test3 = 1230;
		int test4 = 405060;
		int result= replaceall0swith5(test1);
		System.out.println(result);
	}

	/**
	 * @param test1
	 * @return
	 */
	private static int replaceall0swith5(int test1) {
//		return Integer.valueOf(String.valueOf(test1).replace('0', '5'));
		String replace = Integer.toString(test1).replace('0', '5');
		return Integer.parseInt(replace);
	}

}
