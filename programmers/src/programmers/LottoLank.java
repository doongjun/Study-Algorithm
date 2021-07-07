package programmers;

import java.util.Arrays;

//로또 최고 순위와 최저 순위
public class LottoLank {

	public static void main(String[] args) {
		class Solution {
		    public int[] solution(int[] lottos, int[] win_nums) {
		        int[] answer = {0, 0};
		        
		        for(int x : lottos) {
		        	if(x==0) {
		        		answer[0]++;
		        		continue;
		        	}
		        	for(int y : win_nums) {
		        		if(x == y) {
		        			answer[1]++;
		        			answer[0]++;
		        		}
		        	}
		        }
		        
		        for(int i=0; i<2; i++) {
		        	if(answer[i]==6) {
		        		answer[i] = 1;
		        	}
		        	else if(answer[i]==5) {
		        		answer[i] = 2;
		        	}
		        	else if(answer[i]==4) {
		        		answer[i] = 3;
		        	}
		        	else if(answer[i]==3) {
		        		answer[i] = 4;
		        	}
		        	else if(answer[i]==2) {
		        		answer[i] = 5;
		        	}
		        	else {
		        		answer[i] = 6;
		        	}
		        }
		        
		        System.out.println(Arrays.toString(answer));
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		s.solution(lottos, win_nums);

	}

}
