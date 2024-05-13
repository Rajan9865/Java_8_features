/**
 * 
 */
package gfgschool;

/**
 * gfgschool
 *DelL
 */
public class Pattern3 {
	public static void main(String[] args) {
		int N=5;
		printPattern(N);
	}

	/**
	 * @param n
	 */
	private static void printPattern(int n) {
		
		 StringBuilder st = new StringBuilder();
	     for(int i=0;i<n;i++){
	         st.append("*");
	         System.out.print(st+" ");
	     }
	}
}
