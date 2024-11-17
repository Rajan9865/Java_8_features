/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class Replaceall0swith5Java8 {
	public static void main(String[] args) {
		int test1 = 1004;
		int test2 = 0;
		int test3 = 1230;
		int test4 = 405060;
		int result= replaceall0swith5(test2);
		System.out.println(result);
	}

	/**
	 * @param test1
	 * @return
	 */
	private static int replaceall0swith5(int test1) {
		String result=Integer.toString(test1)
				.chars()
				.mapToObj(c->c=='0'?'5':(char)c)
				.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)
				.toString();
		return Integer.parseInt(result);
	}

}
