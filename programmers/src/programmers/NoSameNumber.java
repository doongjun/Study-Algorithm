package programmers;

//같은 숫자는 싫어
import java.util.*;

public class NoSameNumber {
	public class Solution {
	    public int[] solution(int []arr) {
	        ArrayList<Integer> tmp = new ArrayList<>();
	        int a = 10;
	        for(int num : arr) {
	        	if(a != num) {
	        		tmp.add(num);
	        	}
	        	a = num;
	        }
	        int[] answer = new int[tmp.size()];
	        
	        for(int i=0; i<answer.length; i++) {
	        	answer[i] = tmp.get(i).intValue();
	        }
	        
	        System.out.println(Arrays.toString(answer));
	        return answer;
	    }
	}
	public static void main(String[] args) {
		
		NoSameNumber nosamenumber = new NoSameNumber();
		NoSameNumber.Solution s = nosamenumber.new Solution();
		
		int[] arr = {1,1,3,3,0,1,1};
		s.solution(arr);
	}

}
