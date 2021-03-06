package programmers;

import java.util.Arrays;
import java.util.Stack;

//인형뽑기
public class Dollpick {
	class Solution {
	    public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        
	        Stack<Integer> stack = new Stack<>();
	        
	        for(int i=0; i<moves.length; i++) {
	        	int col = moves[i];
	        	int j = 0;
	        	while(!(j >= board.length)) {
	        		if(board[j][col-1] == 0) {
	        			j++;
	        		}
	        		else {
	        			if(!stack.isEmpty() && stack.peek()==board[j][col-1]) {
	        				stack.pop();
	        				answer += 2;
	        			}
	        			else {
	        				stack.push(board[j][col-1]);
	        			}
	        			board[j][col-1] = 0;
	        			break;
	        		}
	        	}
	        }
	        
	        System.out.println(answer);
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Dollpick dollpick = new Dollpick();
		Dollpick.Solution s = dollpick.new Solution();
		
		int[][] board = {{0,0,0,0,0},
						 {0,0,1,0,3},
						 {0,2,5,0,1},
						 {4,2,4,4,2},
						 {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		s.solution(board, moves);
	}

}
