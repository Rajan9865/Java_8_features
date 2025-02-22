/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 * 
 * @author Rajan kumar
 */
public class Search2DMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7 }, { 10, 13, 16 }, { 20, 24, 30 } };
		int target = 131;
		System.out.println("found element " + search2DMatrix(matrix, target));
	}

	/**
	 * @param matrix
	 * @param target
	 * @return
	 */
	private static boolean search2DMatrix(int[][] matrix, int target) {
		for (int[] row : matrix) {
			for (int num : row) {
				if (num == target) {
					return true;
				}
			}
		}
		return false;
	}
}
