package programmers;

import java.util.*;

//Level1
//소수
public class MakeDecimal {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int[] nums) {
		        int answer = 0;
		        ArrayList<Integer> arr = new ArrayList<>();
		        
		        for(int i=0;i<nums.length;i++) {
		        	for(int j=i+1; j<nums.length; j++) {
		        		for(int k=j+1; k<nums.length; k++) {
		        			arr.add(nums[i]+nums[j]+nums[k]);
		        		}
		        	}
		        }

		        for(int i=0; i<arr.size(); i++) {
		        	boolean bol = true;
		        	for(int j=2; j<=arr.get(i)/2; j++) {
		        		if(arr.get(i)%j==0) {
		        			bol=false;
		        			break;
		        		}
		        	}
		        	if(bol==true)
		        		answer++;
		        }
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] nums = {1,2,7,6,4};
		s.solution(nums);

	}

}
