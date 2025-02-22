/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class Gamewithnos {
	public static void main(String[] args) {
		int[] arr = { 10, 11, 1, 2, 3 };
		int n = arr.length + 1;
		int[] result = game_with_number(arr, n);
		printArray(result);
	}

	/**
	 * @param result
	 */
	private static void printArray(int[] result) {
		for(int num:result) {
			System.out.print(num+" ");
		}
	}

	/**
	 * @param arr
	 * @param n
	 * @return
	 */
	private static int[] game_with_number(int[] arr, int n) {
		int[] original=new int[n];
		original[0]=0;
		for(int i=1;i<n;i++) {
			original[i]=arr[i-1]^original[i-1];
		}
		return original;
	}

}
