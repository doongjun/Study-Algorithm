package programmers;

//핸드폰 번호 가리기
public class HidePhonenum {
	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        int star = phone_number.length()-4;
	        for(int i=0; i<phone_number.length(); i++) {
	        	if(i<star) {
	        		answer += "*";
	        	}
	        	else {
	        		answer += phone_number.charAt(i);
	        	}
	        }
	        
	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		HidePhonenum hidephonenum = new HidePhonenum();
		HidePhonenum.Solution s = hidephonenum.new Solution();
		
		String phone_number = "027778888";
		s.solution(phone_number);
	}

}
