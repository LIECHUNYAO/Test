package lianxi;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

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
		
		// 测试老师gitlab代码  Map<Integer,TreeSet<String>>
		/*Map<Integer,TreeSet<String>> table = new HashMap<Integer,TreeSet<String>>();
		TreeSet<String> emptySet = new TreeSet<String>();
		TreeSet tree = new TreeSet();
		tree.add("xsd");
		tree.add("saa");
		table.put(1,tree);
		for(Map.Entry a :table.entrySet() ){
			System.out.println("key\t"+a.getKey()+""+"value\t"+a.getValue());
		}
		*/
		
		//ArrayList<Map<String, Integer>>  测试和遍历方法
		/*ArrayList<Map<String, Integer>>  list1 = new ArrayList<Map<String, Integer>>();
		  Map<String, Integer> m1 = new HashMap<String, Integer>();
		  m1.put("a", 3);
		  m1.put("b", 1);
		  m1.put("c", 1);
		  m1.put("d", 2);
		  list1.add(m1);
		  
		  Map<String, Integer> m2 = new HashMap<String, Integer>();
		  m2.put("a", 34);
		  m2.put("b", 13);
		  m2.put("c", 12);
		  m2.put("d", 21);
		  
		  list1.add(m2);
		  
		  ArrayList<Map<String, Integer>>  list2 = new ArrayList<Map<String, Integer>>();
		  int a = 0;
		  int b = 0;
		  int c = 0;
		  int d = 0;
		  for(int i=0; i<list1.size(); i++) {
		   Map<String, Integer> m = list1.get(i);
		   a += m.get("a");
		   b += m.get("b");
		   c += m.get("c");
		   d += m.get("d");
		  }
		  Map<String, Integer> m = new HashMap<String, Integer>();
		  m.put("a", a);
		  m.put("b", b);
		  m.put("c", c);
		  m.put("d", d);
		  list2.add(m);
		  for (int i = 0; i < list1.size(); i++) {
			  System.out.println(list1.get(i));
			  for (Map.Entry entry : list1.get(i).entrySet()) {
				  System.out.println("key "+entry.getKey()+" vslue:"+entry.getValue());
			}
		}*/
		
		//使用迭代器来删除list里面的数据是非常好的因为不会存在两个相同数据在一起
		//按照一般方法删除会导致第二个重复的数据未被删除，但迭代器不会，Iterator.hasnext();
		/*
		public static void remove(ArrayList<String> list) 
		{
			Iterator<String> it = list.iterator();
			while (it.hasNext()) 
			{
				String s = it.next();
				if (s.equals("b")) 
				{
				it.remove();
				}
			}
		}
		*/

		
		
	}

}
