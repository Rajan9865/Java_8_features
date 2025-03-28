/**
 * 
 */
package hitAndTrail;

/**
 * hitAndTrail
 * 
 * @author Rajan kumar
 */
public class MoveZeroes {
	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        printArray(nums);
	}

	/**
	 * @param nums
	 */
	private static void printArray(int[] nums) {
		for(int num:nums) {
			System.out.print(num+" ");
		}
	}

	/**
	 * @param nums
	 */
	private static void moveZeroes(int[] nums) {
		int index=0;
		for(int num:nums) {
			if (num!=0) {
				nums[index++]=num;
			}
		}
		while (index<nums.length) {
			nums[index++]=0;
		}
	}

}
