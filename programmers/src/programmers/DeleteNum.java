package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//제일 작은 수 제거하기
public class DeleteNum {
	class Solution {
	    public int[] solution(int[] arr) {
	    	int[] answer = {};
	    	ArrayList<Integer> temp = new ArrayList<>();
	    	
	    	//최소값 받아오기
	    	int min = Arrays.stream(arr).min().getAsInt();
	    	
	    	if(arr.length != 1) {
	    		for(int num : arr) {
		    		if(num != min) {
		    			temp.add(num);
		    		}
		    	}
	    		
	    	}
	    	else {
	    		temp.add(-1);
	    	}
	    	
	    	answer = temp.stream().mapToInt(i -> i).toArray();
	        
	       	System.out.println(Arrays.toString(answer));
	        return answer;
	    }
	}
	public static void main(String[] args) {
		DeleteNum deletenum = new DeleteNum();
		DeleteNum.Solution s = deletenum.new Solution();
		
		int[] arr = {10};
		s.solution(arr);
	}

}
