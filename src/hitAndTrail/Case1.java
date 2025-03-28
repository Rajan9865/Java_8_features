/**
 * 
 */
package hitAndTrail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * hitAndTrail
 *@author Rajan kumar
 */
public class Case1 {
	public static void main(String[] args) {
		HashSet<Integer>hashSet=new HashSet<>(Arrays.asList(1,5,3,2,7));
		List<Integer>list=new ArrayList<>(hashSet);
//		Collections.sort(list);
		System.out.println("hashSet :"+list);
		LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>(Arrays.asList(6,2,7,1));
		List<Integer>list2=new ArrayList<>(linkedHashSet);
//		Collections.sort(list2);
		System.out.println("linkedhashSet "+list2);
	}

}
