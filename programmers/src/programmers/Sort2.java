package programmers;

import java.util.Arrays;

//H-Index
public class Sort2 {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int[] citations) {
		        int answer = 0;
		        
		        Arrays.sort(citations);
		        int length = citations.length;
		        //0,1,3,5,6
		        for(int i=0; i<length; i++) {
		        	int next = length-i;
		        	
		        	if(citations[i] >= next) {
		        		answer = next;
		        		break;
		        	}
		        		
		        }
		        
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] citations = {3, 0, 6, 1 ,5};
		s.solution(citations);
	}

}
