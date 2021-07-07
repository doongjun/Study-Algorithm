package programmers;

import java.util.Arrays;

public class PushKeypad {	
	public static void main(String[] args) {
		class Solution {
	        int[][] pad = {{1,2,3},{4,5,6},{7,8,9},{10, 0, 10}};
	        int[] lflag = {3,0};
	        int[] rflag = {3,2};
	        
 		    public String key(int num, String hand) {
 		    	String pinger = "";
		    	for(int i=0; i<pad.length; i++) {
		    		for(int j=0; j<pad[0].length; j++) {
		    			if(pad[i][j] == num) {
		    				if(num==1||num==4||num==7) {
		    					pinger = "L";
		    					lflag[0] = i;
		    					lflag[1] = j;
		    				}
		    				else if(num==3||num==6||num==9) {
		    					pinger = "R";
		    					rflag[0] = i;
		    					rflag[1] = j;
		    				}
		    				else {
		    					int a =  Math.abs(i-lflag[0]);
		    					int b = Math.abs(i-rflag[0]);
		    					int x = Math.abs(j-lflag[1]);
		    					int y = Math.abs(j-rflag[1]);
		    					
		    					if(a+x > b+y) {
		    						pinger = "R";
		    						rflag[0] = i;
			    					rflag[1] = j;
		    					}
		    					else if(a+x < b+y) {
		    						pinger = "L";
		    						lflag[0] = i;
			    					lflag[1] = j;
		    					}
		    					else {
		    						if(hand.equals("right")) {
		    							pinger = "R";
		    							rflag[0] = i;
				    					rflag[1] = j;
		    						}
		    						else {
		    							pinger = "L";
		    							lflag[0] = i;
				    					lflag[1] = j;
		    						}
		    							
		    					}
		    				}
		    			}
		    		}
		    	}
		    	return pinger;
		    }
		    public String solution(int[] numbers, String hand) {
		        String answer = "";

		        for(int x : numbers) {
		        	answer += key(x, hand);
		        }
		        
		        System.out.println(answer);
		        return answer;
		    }
		}
		
		Solution s = new Solution();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		s.solution(numbers, hand);
	}

}
