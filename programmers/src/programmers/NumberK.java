package programmers;

import java.util.Arrays;

//k번째 수
public class NumberK {
	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        
//	        for(int i=0; i<commands.length; i++) {
//	        	int[] res = new int[commands[i][1]-commands[i][0]+1];
//	        	for(int j=0; j<res.length; j++) {
//	        		res[j] = array[j+(commands[i][0]-1)];
//	        	}
//	        	Arrays.sort(res);
//	        	answer[i] = res[commands[i][2]-1];
//	        }
	        
	        for(int i=0; i<commands.length; i++) {
	        	int[] res = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
	        	Arrays.sort(res);
	        	
	        	answer[i] = res[commands[i][2]-1];
 	        }
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		NumberK numberk = new NumberK();
		NumberK.Solution s = numberk.new Solution();
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		s.solution(array, commands);

	}

}
