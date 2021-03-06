package programmers;

//다음 큰 숫자
public class NextBigNum {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int n) {
		        int answer = 0;
		        int onecnt = 0;
		        String bin = Integer.toBinaryString(n);
		        
		        for(int i=0; i<bin.length(); i++) {
		        	if(bin.charAt(i) == '1') {
		        		onecnt++;
		        	}
		        }
		        
		        while(true) {
		        	n++;
		        	int twocnt = 0;
		        	bin = Integer.toBinaryString(n);

			        for(int i=0; i<bin.length(); i++) {
			        	if(bin.charAt(i) == '1') {
			        		twocnt++;
			        	}
			        }
			        
			        if(twocnt == onecnt) {
			        	answer = n;
			        	break;
			        } 	
		        }
		        
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		s.solution(15);
	}

}
