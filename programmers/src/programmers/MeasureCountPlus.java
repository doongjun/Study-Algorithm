package programmers;

//level1
//약수의 개수와 덧셈
public class MeasureCountPlus {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int left, int right) {
		        int answer = 0;
		        
		        for(int i=left; i<=right; i++) {
		        	int cnt = 1;
		        	for(int j=1; j<=i/2; j++) {
		        		if(i%j==0) {
		        			cnt++;
		        		}
		        	}
		        	if(cnt%2==0) {
		        		answer += i;
		        	}
		        	else {
		        		answer -= i;
		        	}
		        }
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		s.solution(13, 17);

	}

}
