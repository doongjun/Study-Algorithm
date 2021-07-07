package programmers;

import java.util.ArrayList;
import java.util.List;

//프린터(스택,큐)
public class StackAndQueue2 {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int[] priorities, int location) {
		        int answer = 0;
		        
		        List<Integer> queue = new ArrayList<>();
		        ArrayList<Integer> arr = new ArrayList<>();
		        
		        for(int i=0; i<priorities.length; i++) {
		        	queue.add(priorities[i]);
		        }
		        int rescnt = 0;
		        while(!queue.isEmpty()) {
		        	int cnt = 0;
		        	for(int i=1; i<queue.size(); i++) {	        	
			        	if(queue.get(0)<queue.get(i)) {
			        		queue.add(queue.remove(0));
			        		location--;
			        		if(location<0) {
			        			location = queue.size()-1;
			        		}
			        		cnt++;
			        		break;
			        	}
			        }
		        	if(cnt==0) {
		        		arr.add(queue.remove(0));
		        		answer++;
		        		location--;
		        		if(location<0) {
		        			break;
		        		}
		        	}
		        }
		        
		        System.out.println(answer);
		        
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		
		int[] priorities = {2,1,3,2};
		int location = 2;
		s.solution(priorities, location);

	}

}
