/**
 * 
 */
package gfg.basic;

/**
 * gfg.basic
 *DelL
 */
public class ImmediateSmallerElement {
	public static void main(String[] args) {
		ImmediateSmallerElement immediateSmallerElement=new ImmediateSmallerElement();
//		int[] arr1={4, 3, 2, 5, 6};
		int[] arr1={4 ,2 ,1 ,5 ,3};
		immediateSmallerElement.immediateSmaller(arr1,arr1.length);
		System.out.println("updated array 1");
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	/**
	 * @param arr1
	 * @param length
	 */
	private void immediateSmaller(int[] arr1, int length) {
		for(int i=0;i<arr1.length-1;i++)
		{
			if (arr1[i]>arr1[i+1]) {
				arr1[i]=arr1[i+1];
			} else {
				arr1[i]=-1;
			}
		}
		arr1[arr1.length-1]=-1;
	}

}
