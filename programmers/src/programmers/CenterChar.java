package programmers;

//가운데 글자 가져오기
public class CenterChar {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        /*
	        int a = (int)Math.floor(s.length()/2);
	        
	        if(s.length()%2 == 0) {
	        	answer += s.charAt(a-1);
	        	answer += s.charAt(a);
	        }
	        
	        else {
	        	answer += s.charAt(a);
	        }*/
	        
	        answer = s.substring((s.length()-1)/2, s.length()/2+1);

	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		CenterChar centerchar = new CenterChar();
		CenterChar.Solution s = centerchar.new Solution();
		
		String a = "qwser";
		s.solution(a);
		

	}

}
