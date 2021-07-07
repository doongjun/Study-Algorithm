package programmers;

import java.util.regex.Pattern;

//시저 암호
public class CaesarCipher {
	class Solution {
	    public String solution(String s, int n) {
	        String answer = "";
	        
	        for(int i=0; i<s.length();i++) {
	        	char c = s.charAt(i);
	        	
	        	if(c >= 'A' && c <= 'Z') {
	        		if(c+n > 'Z') {
	        			answer += (char)(c+n-26);
	        		}
	        		else {
	        			answer += (char)(c+n);
	        		}
	        	}
	        	else if(c >= 'a' && c <= 'z') {
	        		if(c+n > 'z') {
	        			answer += (char)(c+n-26);
	        		}
	        		else {
	        			answer += (char)(c+n);
	        		}
	        	}
	        	else if(c == ' '){
	        		answer += c;
	        	}
	        }
	        System.out.println(answer);
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		CaesarCipher cipher = new CaesarCipher();
		CaesarCipher.Solution s = cipher.new Solution();
		String str = "a B z";
		int n = 4;
		s.solution(str, n);
	}

}
