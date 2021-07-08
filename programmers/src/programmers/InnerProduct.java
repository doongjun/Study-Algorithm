package programmers;

//level1
//내적
public class InnerProduct {
	public static void main(String[] args) {
		class Solution {
		    public int solution(int[] a, int[] b) {
		        int answer = 0;
		        
		        for(int i=0; i<a.length; i++) {
		        	answer += (a[i]*b[i]);
		        }
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		s.solution(a, b);

	}

}
