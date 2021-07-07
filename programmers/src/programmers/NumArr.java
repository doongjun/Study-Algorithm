package programmers;

import java.util.ArrayList;
import java.util.Arrays;

//나누어 떨어지는 숫자 배열
public class NumArr {
	class Solution {
	    public int[] solution(int[] arr, int divisor) {
	    	ArrayList<Integer> tmp = new ArrayList<>();
	    	
	    	for(int num : arr) {
	    		if(num % divisor == 0) {
	    			tmp.add(num);
	    		}
	    	}
	    	if(tmp.size() == 0) tmp.add(-1);
	        int[] answer = new int[tmp.size()];
	        
	        answer = tmp.stream().mapToInt(i -> i).toArray();
	        Arrays.sort(answer);
	        System.out.println(Arrays.toString(answer));
	        
	        return answer;
	    }
	}
	public static void main(String[] args) {
		NumArr numarr = new NumArr();
		NumArr.Solution s = numarr.new Solution();
		
		int[] arr = {2, 36, 1, 3};
		int divisor = 1;
		s.solution(arr, divisor);
	}

}
