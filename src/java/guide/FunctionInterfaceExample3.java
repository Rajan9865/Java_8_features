/**
 * 
 */
package java.guide;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author deby7
 *4:24:53 pm
 *2024
 *Java_8_Features_examples
 *TODO
 */
public class FunctionInterfaceExample3 {
	/*
	public static void main(String[] args) {
        // example 4
       List<String> list = Arrays.asList("Banana", "Mango", "Apple", "Watermelon");
       // lambda
       Map<String, Integer> map = convertListToMap(list, x -> x.length());

       System.out.println(map); // {node=4, c++=3, java=4, javascript=10}
   }

   private static <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {

       Map<T, R> result = new HashMap<>();
       for (T t : list) {
           result.put(t, func.apply(t));
       }
       return result;
   }
   */
	
	public static void main(String[] args) {
		List<String>list=Arrays.asList("rajan","ramu","apple");
		Map<String, Integer> map = convertListToMap(list, x -> x.length());
		System.out.println(map);
	}

	/**
	 * @param list
	 * @param object
	 * @return
	 */
	private static Map<String, Integer> convertListToMap(List<String> list, Function<String, Integer> function) {
		Map<String, Integer>resultMap=new HashMap<>();
		for(String string:list)
		{
			resultMap.put(string, function.apply(string));
		}
		return resultMap;
	}

	
}