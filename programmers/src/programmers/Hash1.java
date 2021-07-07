package programmers;

import java.util.HashMap;

//전화번호 목록(해시)
public class Hash1 {

	public static void main(String[] args) {
		class Solution {
		    public boolean solution(String[] phone_book) {
		        
		        HashMap<String, Integer> hash = new HashMap<>();
		        
		        for(int i=0; i<phone_book.length; i++) {
		        	hash.put(phone_book[i], i);
		        }
		        
		        for(int i=0; i<phone_book.length; i++) {
		        	for(int j=1; j<phone_book[i].length(); j++) {
		        		if(hash.containsKey(phone_book[i].substring(0, j))) {
		        			return false;
		        		}
		        	}
		        }
		        
		        
		        return true;
		    }
		}
		
		Solution s = new Solution();
		
		String[] phone_book = {"1195524421","119","97674223"};
 		s.solution(phone_book);

	}

}
