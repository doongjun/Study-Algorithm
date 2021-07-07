package programmers;

import java.util.HashMap;

//위장(해시)
public class Hash2 {

	public static void main(String[] args) {
		class Solution {
		    public int solution(String[][] clothes) {
		        int answer = 1;
		        
		        HashMap<String, Integer> hash = new HashMap<>();
		        
		        for(int i=0; i<clothes.length; i++) {
		        	hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1], 0)+1);
		        }
		        
		        for(String key : hash.keySet()) {
		        	answer *= (hash.get(key)+1);
		        }
		        System.out.println(answer);
		        
		        return answer-1;
		    }
		}
		
		Solution s = new Solution();
		
		String[][] clothes = {{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
		//String[][] clothes = {{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"}};
		s.solution(clothes);
	}

}
