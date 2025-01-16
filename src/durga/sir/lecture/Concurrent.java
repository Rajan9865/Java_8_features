/**
 * 
 */
package durga.sir.lecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * durga.sir.lecture
 * 
 * @author Rajan kumar
 */
public class Concurrent {
	public static void main(String[] args) {
//		Map<String, String>cleanCityMap=new HashMap<>();
		Map<String, String>cleanCityMap=new ConcurrentHashMap<String, String>();
		cleanCityMap.put("city1", "patna");
		cleanCityMap.put("city2", "noida");
		cleanCityMap.put("city3", "delhi");
//		System.out.println(cleanCityMap);
		Iterator<Map.Entry<String, String>>iterator=cleanCityMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String>entry=iterator.next();
			cleanCityMap.remove("city2");
		}
		System.out.println(cleanCityMap);
		System.out.println(cleanCityMap.size());
	}
}
