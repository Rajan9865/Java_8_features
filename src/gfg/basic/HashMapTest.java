/**
 * 
 */
package gfg.basic;

import java.util.HashMap;

/**
 * gfg.basic
 *@author Rajan kumar
 */
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap=new HashMap<>();
		hashMap.put("math", 34);
		hashMap.put("physics", 44);
		hashMap.put("english", 54);
		hashMap.put(null, null);
		hashMap.put(null, null);
		System.out.println(hashMap);
	}

}
