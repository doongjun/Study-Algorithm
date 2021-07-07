package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//문자열 내 마음대로 정렬하기
public class StrMySort {

	public static void main(String[] args) {
		class Solution {
		    public String[] solution(String[] strings, int n) {
		    	String[] answer = new String[strings.length];
		    	ArrayList<String> temp = new ArrayList<>();
		    	
		    	for(int i=0; i<strings.length; i++) {
		    		String tmp = strings[i].charAt(n) + strings[i];
		    		temp.add(tmp);
		    	}
		    	
		    	Collections.sort(temp);
		    	
		    	for(int i=0; i<answer.length; i++) {
		    		answer[i] = temp.get(i).substring(1);
		    	}
		    	
		    	System.out.println(Arrays.toString(answer));
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		
		String[] strs = {"sun", "bed", "car"};
		int n = 1;
		s.solution(strs, n);

	}

}
