package programmers;

//체육복 - Greedy
public class Gymsuit {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        int student[] = new int[n];
	        
	        for(int x : lost){
	            student[x-1]--;
	        }
	        
	        for(int x : reserve){
	            student[x-1]++;
	        }
	           
	        for(int i=0; i<n; i++) {
	        	if(student[i]<0) {
	        		if(i!=n-1 && student[i+1]>0) {
	        			student[i+1]--;
	        			student[i]++;
	        		}
	        		else if(i!=0 && student[i-1]>0) {
	        			student[i-1]--;
	        			student[i]++;
	        		}
	        	}
	        }
	        
	        for(int i=0; i<n; i++) {
	        	if(student[i]>=0) answer++;
	        }
	        System.out.println(answer);
	        return answer;
	        
	    }
	}
	public static void main(String[] args) {
		Gymsuit gymsuiy = new Gymsuit();
		Gymsuit.Solution s = gymsuiy.new Solution();
		
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		
		s.solution(n, lost, reserve);
	}

}
