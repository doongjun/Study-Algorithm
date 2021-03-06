package programmers;

import java.util.Arrays;

//땅따먹기
public class EatTheGround {

	public static void main(String[] args) {
		class Solution {
		    int solution(int[][] land) {
		        int answer = 0;
		        
		        for(int i=0; i<land.length-1; i++) {
		        	
		        	int tmp = Math.max(land[i][1], land[i][2]);
		        	land[i+1][0] +=  Math.max(tmp, land[i][3]);
		        	
		        	tmp = Math.max(land[i][0], land[i][2]);
		        	land[i+1][1] +=  Math.max(tmp, land[i][3]);
		        	
		        	tmp = Math.max(land[i][0], land[i][1]);
		        	land[i+1][2] +=  Math.max(tmp, land[i][3]);
		        	
		        	tmp = Math.max(land[i][0], land[i][1]);
		        	land[i+1][3] +=  Math.max(tmp, land[i][2]);
		        }
		        
		        int max = 0;
		        for(int i=0; i<4; i++) {
		        	if(land[land.length-1][i] > max) {
		        		max = land[land.length-1][i];
		        	}
		        }
		        answer = max;
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[][] land = {{1, 2, 3, 5},{5, 6, 7, 8},{4, 3, 2, 1}};
		s.solution(land);
	}

}
