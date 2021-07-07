package note;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int[] priorities, int location) {
		        int answer = 0;
		        
		        ArrayList<Integer> queue = new ArrayList<>();
		        ArrayList<Integer> arr = new ArrayList<>();
		        
		        for(int i=0; i<priorities.length; i++) {
		        	queue.add(priorities[i]);
		        }
		        
		        while(!queue.isEmpty()) {
		        	int tmp = queue.remove(0);
		        	int cnt = 0;
		        	for(int i=0; i<queue.size(); i++) {
		        		cnt = 0;
		        		if(tmp < queue.get(i)) {
		        			queue.add(tmp);
		        			location--;
		        			if(location<0) {
		        				location = queue.size()-1;
		        			}
		        			cnt++;
		        			break;
		        		}
		        	}
		        	if(cnt == 0) {
		        		arr.add(tmp);
		        		answer++;
		        		location--;
		        		if(location<0)
		        			break;
		        	}
		        }
		        
		        
		        System.out.println(answer);
		        
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		s.solution(priorities, location);
	}

}
