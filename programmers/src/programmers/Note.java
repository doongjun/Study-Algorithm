package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Note {

	public static void main(String[] args) {
		class Solution {
		    public int[] solution(int[] progresses, int[] speeds) {
		        Queue<Integer> queue = new LinkedList<Integer>(); 
		        List<Integer> list = new ArrayList<Integer>();
		        
		        for(int i=0; i<progresses.length; i++) {
		        	int count = 0;
		        	while(progresses[i]<100) {
		        		progresses[i] += speeds[i];
		        		count++;
		        	}
		        	queue.offer(count);
		        }
		        
		        int count = 1;
		        int pre = queue.poll();
		        while(!queue.isEmpty()) {
		        	int cur = queue.poll();
		        	if(pre >= cur) {
		        		count++;
		        	}else {
		        		list.add(count);
		        		pre = cur;
		        		count = 1;
		        	}	
		        }
		        list.add(count);
		        int[] answer = new int[list.size()];
		        for(int i=0; i<list.size(); i++) {
		        	answer[i] = list.get(i);
		        }
		        System.out.println(Arrays.toString(answer));
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		s.solution(progresses, speeds);
	}

}
