package programmers;

import java.util.*;
import java.util.Map.Entry;

public class FailureRate {
	
	public static void main(String[] args) {
		class Solution {
		    public int[] solution(int n, int[] stages) {
		        int[] answer = new int[n];
		        ArrayList<Integer> arr = new ArrayList<>();
		        LinkedHashMap<Integer, Double> hash = new LinkedHashMap<>();
		        
		        for(int i=0; i<stages.length; i++) {
		        	arr.add(stages[i]);
		        }
		        
		        for(int i=1; i<=n; i++) {
		        	double cnt = 0;
		        	double size = arr.size();
		        	for(int j=0; j<arr.size(); j++) {
		        		if(i==arr.get(j)) {
		        			cnt++;
		        			arr.remove(j);
		        			j=j-1;
		        		}
		        	}
		        	
		        	Double rate = (Double)cnt/size;
		        	if(size==0) rate = 0.0;
		        	hash.put(i, rate);
		        }

		        int idx=0;
		        for(int i=0; i<n; i++) {
		        	Integer maxKey = 0;
		        	Double maxValue = -1.0;
		        	for(Entry<Integer, Double> entry : hash.entrySet()) {
		        		if(entry.getValue()>maxValue) {
		        			maxValue = entry.getValue();
		        			maxKey = entry.getKey();
		        		}
		        	}
		        	answer[idx] = (int)maxKey;
		        	idx++;
		        	hash.remove(maxKey);
		        }

		        System.out.println(Arrays.toString(answer));
		        
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int n = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		s.solution(n, stages);

	}

}
