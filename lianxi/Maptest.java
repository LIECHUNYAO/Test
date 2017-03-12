package lianxi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maptest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "wo");
		map.put("2", "shi");
		map.put("3", "Yao");

		// 使用map.keyset() 或者 map.values 实现
		/*
		 * for(String a : map.values()){
		 *  System.out.println("Value: "+a); 
		 *  }
		 */

		// 使用Iterator 迭代器和map.entry()配合来遍历
		/*
		 * Iterator ithash = map.entrySet().iterator(); while (ithash.hasNext())
		 * { System.out.println(ithash.next());
		 * 
		 * }
		 */

		// 使用Map.entry()和其内部方法.getKey(), .getValue() 来遍历
		/*
		 * for(Map.Entry<String, String> entry : map.entrySet()){
		 * System.out.println
		 * ("key:"+entry.getKey()+" "+"value:"+entry.getValue()); }
		 */
		
		// hashmap的.containsvalue() or .containskey() ; 查看table里面是否含有对应的参数
		/*if (map.containsValue("wo")) {
			System.out.println("yes");
		}
		if(map.containsKey("1")){
			System.out.println(map.containsKey("1"));
		}*/
		
		
	}

}
