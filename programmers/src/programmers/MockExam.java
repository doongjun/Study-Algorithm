package programmers;

import java.util.ArrayList;
import java.util.List;

//모의고사
//완전탐색
public class MockExam {

	public static void main(String[] args) {
		class Solution {
		    public int[] solution(int[] answers) {
		        int[] pattern1 = {1,2,3,4,5};
		        int[] pattern2 = {2,1,2,3,2,4,2,5};
		        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
		        int[] cnt = {0, 0, 0};
		        
		        for(int i=0; i<answers.length; i++) {
		        	if(pattern1[i%pattern1.length] == answers[i]) cnt[0]++;
		        	if(pattern2[i%pattern2.length] == answers[i]) cnt[1]++;
		        	if(pattern3[i%pattern3.length] == answers[i]) cnt[2]++;
		        }
		        
		        int max = 0;
		        for(int i=0; i<cnt.length; i++) {
		        	if(cnt[i]>max) {
		        		max = cnt[i];
		        	}
		        }
		        
		        List<Integer> res = new ArrayList<>();
		        
		        if(cnt[0] == max) res.add(1);
		        if(cnt[1] == max) res.add(2);
		        if(cnt[2] == max) res.add(3);
		        
		        int[] answer = new int[res.size()];
		        for(int i=0; i<res.size(); i++) {
		        	answer[i] = res.get(i);
		        }
		        
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] answers = {1,2,3,4,5};
		s.solution(answers);


	}

}
