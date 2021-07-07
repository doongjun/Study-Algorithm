package programmers;

import java.util.Arrays;
import java.util.Collections;

public class StrDes {

	public static void main(String[] args) {
		class Solution {
		    public String solution(String s) {
		        String[] temp = s.split("");
		        Arrays.sort(temp, Collections.reverseOrder());
		        String answer = String.join("", temp);
		        System.out.println(answer);
		        
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		String str = "Zbcdefg";
		s.solution(str);

	}

}
