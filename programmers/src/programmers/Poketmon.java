package programmers;

import java.util.ArrayList;

//폰켓몬
public class Poketmon {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int[] nums) {
		        int answer = 0;
		        ArrayList<Integer> picks = new ArrayList<>();
		        
		        picks.add(nums[0]);
		        for(int i=1; i<nums.length; i++) {
		        	int flag = 0;
		        	for(int j=0; j<picks.size(); j++) {
		        		if(nums[i]==picks.get(j)) {
		        			flag=1;
		        			break;
		        		}
		        	}
		        	if(picks.size() == nums.length/2) break;
		        	if(flag==0) {
		        		picks.add(nums[i]);
		        	}
		        	
		        }
		        answer = picks.size();
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] nums = {3,3,3,2,2,2};
		s.solution(nums);

	}

}
