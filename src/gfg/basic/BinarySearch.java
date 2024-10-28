/**
 * 
 */
package gfg.basic;

/**
 * gfgBasic
 *DelL
 */
public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch binarySearch=new BinarySearch();
		int[] arr= {2,3,4,5,6,7,8};
		int length=arr.length;
		int searchkey=10;
		int result=binarySearch.searchkeynumber(arr,length,searchkey);
		if (result==-1) {
			System.out.println("element is not presemt");
		} else {
			System.out.println("element is found at index :"+result);
		}
	}

	/**
	 * @param arr
	 * @param length
	 * @param searchkey
	 * @return
	 */
	private int searchkeynumber(int[] arr, int length, int searchkey) {
		for(int i=0;i<length;i++)
		{
			if (searchkey==arr[i]) {
				return i;
			}
		}
		return -1;
	}

}
