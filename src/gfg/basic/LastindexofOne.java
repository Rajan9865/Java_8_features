/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class LastindexofOne {
	public static void main(String[] args) {
		String test1 = "0010010";
		String test2 = "0000000";
		String test3 = "1";
		String test4 = "0";
		String test5 = "";
	        int result= lastIndex(test1);
	       System.out.println("last index :"+result);
	}

	/**
	 * @param test1
	 * @return 
	 */
	private static int lastIndex(String test1) {
		for (int i=test1.length()-1;i>=0;i--) {
			if (test1.charAt(i)=='1') {
				return 1;
			}
		}
		return-1;
	}

}
