/**
 * 
 */
package interview.prepration;

import java.util.ArrayList;

/**
 * interview.prepration
 *@author Rajan kumar
 */
public class WrapperExample {
	public static void main(String[] args) {
		Integer numInteger=20;
		int num=numInteger;
		System.out.println("Wrapper integer object:" +numInteger);
		System.out.println("primitive int value from Intege :"+num);
		ArrayList<Integer>arrayList=new ArrayList<>();
		arrayList.add(30);
		arrayList.add(numInteger);
		System.out.println("Arraylist with integer objects :"+arrayList);
	}
}
