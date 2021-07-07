package note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class NaverTest1 {

	public static void main(String[] args) {
		class Solution{
			public String[] solution(String[] params) {	
				ArrayList<String> arr = new ArrayList<>();
				ArrayList<String> arr1 = new ArrayList<>();
				LinkedHashMap<String, Integer> hash = new LinkedHashMap<>();
				
				for(int i=0; i<params.length; i++) {
					int tmp = params[i].length()-3;
					String a = "";
					if(Character.isDigit(params[i].charAt(tmp))) {
						int x = tmp -3;
						a = params[i].charAt(x) + "." + params[i].charAt(tmp+2);
						//System.out.println(a);
						arr.add(a);
					}
					else {
						a = params[i].charAt(tmp) + "." + params[i].charAt(tmp+2);
						//System.out.println(a);
						arr.add(a);
					}
						
				}
				
				for(int i=0; i<arr.size(); i++) {
		        	hash.put(arr.get(i), hash.getOrDefault(arr.get(i), 0)+1);
		        }
				
				for(Entry<String, Integer> entry : hash.entrySet()) {
					if(entry.getValue()>1) {
						arr1.add(entry.getKey());
						arr1.add(entry.getValue().toString());
					}
						
				}
				String[] answer = new String[arr1.size()];
				
				for(int i=0; i<answer.length; i++) {
					answer[i] = arr1.get(i);
				}
				System.out.println(Arrays.toString(answer));

				return answer;
 			}
		}
		
		Solution s = new Solution();
		String[] params = {"/a/a_v2.x","/b/a.x","/c/t.z","/d/a/t.x","/e/z/t_v1.z","/k/k/k/a_v9.x"};
		s.solution(params);



	}

}
