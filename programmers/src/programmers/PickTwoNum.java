package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PickTwoNum {

	public static void main(String[] args) {
		class Solution {
		    public int[] solution(int[] numbers) {
		        ArrayList<Integer> arr = new ArrayList<>();
		        
		        for(int i=0; i<numbers.length; i++) {
		        	for(int j=i+1; j<numbers.length; j++) {
		        		int tmp = numbers[i]+numbers[j];
		        		if(!arr.contains(tmp))
		        			arr.add(tmp);
		        	}
		        }
		        Collections.sort(arr);
		        int[] answer = new int[arr.size()];

		        for(int i=0; i<answer.length; i++) {
		        	answer[i] = arr.get(i);
		        }
		        System.out.println(Arrays.toString(answer));
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] numbers = {2,1,3,4,1};
 		s.solution(numbers);

	}

}
