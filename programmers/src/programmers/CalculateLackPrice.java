package programmers;

public class CalculateLackPrice {

	public static void main(String[] args) {
		class Solution {
		    public long solution(int price, int money, int count) {
		        long answer = -1;
		        long total = 0;
		        for(int i=1; i<=count; i++) {
		        	total += price * i;
		        }
		        answer = total - (long)money;
		        if(answer<0) return 0;
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int price = 1;
		int money = 1;
		int count = 3;
		s.solution(price, money, count);

	}

}
