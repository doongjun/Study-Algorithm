package note;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class HashPractice {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "쥐");
		map.put(2, "바나나");
		map.put(3, "호랑이");
		
		//entrySet().iterator()
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Map.Entry<Integer, String> entry = entries.next();
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:바나나
		//[Key]:3 [Value]:포도
				
		//keySet().iterator()
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()){
		    int key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:바나나
		//[Key]:3 [Value]:포도

	}

}
