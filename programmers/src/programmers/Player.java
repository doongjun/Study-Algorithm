package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//완주하지 못한 선수(해시)
public class Player {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        Map<String, Integer> hash = new HashMap<>();
	        
	        for(String x : participant) {
	        	hash.put(x, hash.getOrDefault(x, 0)+1);
	        }
	        
	        for(String x : completion) {
	        	hash.put(x, hash.getOrDefault(x, 0)-1);
	        }
	        
	        for(Entry<String, Integer> entry : hash.entrySet()) {
	        	if(entry.getValue() > 0) {
	        		answer = entry.getKey();
	        	}
	        	
	        }
	        
	        
	         
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Player player = new Player();
		Player.Solution s = player.new Solution();
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		s.solution(participant, completion);
	}

}
