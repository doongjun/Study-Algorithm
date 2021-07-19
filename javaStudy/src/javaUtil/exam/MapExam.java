package javaUtil.exam;

import java.util.*;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("001", "kim");
		map.put("002", "bae");
		map.put("003", "park");
		
		map.put("003", "jang");
		
		System.out.println(map.size());
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		System.out.println(map.get("003"));
		
		Set<String> keys = map.keySet();
		
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}

}
