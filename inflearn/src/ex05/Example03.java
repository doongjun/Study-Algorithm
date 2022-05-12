package ex05;

import java.util.Scanner;
import java.util.Stack;

// stack
// 3.크레인 인형뽑기(카카오)
public class Example03 {
	static int solution(int n, int[][] board, int m, int[] moves) {
		int answer = 0;
		
		Stack<Integer> basket = new Stack<>();
		for(int pos : moves) {
			for(int j=0; j<n; j++) {
				if(board[j][pos-1] != 0) {
					int target = board[j][pos-1];
					if(!basket.isEmpty() && basket.peek()==target) {
						basket.pop();
						answer += 2;
					} else {
						basket.push(target);
					}
					
					board[j][pos-1] = 0;
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		
		int m = scan.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++) {
			moves[i] = scan.nextInt();
		}
		
		System.out.println(solution(n, board, m, moves));
	}
}
