package note;

import java.util.*;

//DFS활용
//Flood fill
/*
입력
5
0 0 0 0 0
0 0 0 1 1
0 0 0 1 0
1 1 1 1 0
0 0 0 0 0
1 1 3
 */
public class DFS3 {
	static final int MAX_N = 10;
	static int N;
	static int[][] D = {{-1, 0},{1, 0},{0, -1},{0, 1}};
	static int[][] board = new int[MAX_N][MAX_N];
	static class Point{
		Point(int r, int c){
			row = r;
			col = c;
		}
		int row, col;
	}
	static void dfs(int sRow, int sCol, int color) {
		boolean[][] visited = new boolean[MAX_N][MAX_N];
		Stack<Point> stack = new Stack<>();
		stack.push(new Point(sRow, sCol));

		while(!stack.isEmpty()) {
			Point cur = stack.pop();
			if(visited[cur.row][cur.col]) continue;
			
			visited[cur.row][cur.col] = true;
			board[cur.row][cur.col] = color;
			
			for(int i=0; i<4; i++) {
				int nr = cur.row + D[i][0];
				int nc = cur.col + D[i][1];
				
				if(nr<0 || nr>N-1 || nc<0 || nc>N-1) continue;
				if(visited[nr][nc]) continue;
				if(board[nr][nc] == 1) continue;
				
				stack.push(new Point(nr, nc));
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//입력
		N = scan.nextInt();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		
		int sRow = scan.nextInt();
		int sCol = scan.nextInt();
		int color = scan.nextInt();
		dfs(sRow, sCol, color);
		
		//출력
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

}
