package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//기능개발(스택/큐)
public class StackAndQueue1 {

	public static void main(String[] args) {
		class Solution {
		    public int[] solution(int[] progresses, int[] speeds) {		        
		        List<Integer> queue = new ArrayList<>();
		        ArrayList<Integer> temp = new ArrayList<>();
		        
		        for(int i=0; i<progresses.length; i++) {
		        	int cnt = 0;
		        	while(!(progresses[i] >= 100)) {
		        		progresses[i] += speeds[i];
		        		cnt++;
		        	}
		        	queue.add(cnt);
		        }
		        
		        int pre = queue.remove(0);
		        int rescnt = 1;
		        while(!queue.isEmpty()) {
		        	int cur = queue.remove(0);
		        	if(pre >= cur) {
		        		rescnt++;
		        	}
		        	else {
		        		temp.add(rescnt);
		        		rescnt=1;
		        		pre = cur;
		        	}
		        }
		        temp.add(rescnt);
		        
		        int[] answer = temp.stream().mapToInt(i -> i).toArray();
		        
		        System.out.println(Arrays.toString(answer));
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		
		s.solution(progresses, speeds);

	}

}
