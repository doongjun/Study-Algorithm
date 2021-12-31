package note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//나동빈
//미로탈출
//정답 풀이
class Node_2 {
	private int x;
	private int y;
	
	public Node_2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

public class BFS4_2 {
	public static int[][] board;
	public static int n, m;
	public static int[][] dt = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
	
	public static int bfs(int x, int y) {
		Queue<Node_2> queue = new LinkedList<>();
		queue.offer(new Node_2(x, y));
		
		while(!queue.isEmpty()) {
			Node_2 node = queue.poll();
			
			x = node.getX();
			y = node.getY();
			
			for(int i=0; i<4; i++) {
				int nx = x + dt[i][0];
				int ny = y + dt[i][1];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
				if(board[nx][ny] == 0) continue;
				if(board[nx][ny] == 1) {
					board[nx][ny] = board[x][y] + 1;
					queue.offer(new Node_2(nx, ny));
				}
			}
		}
		
		return board[n - 1][m - 1];
	}
	
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	
    	board = new int[n][m];
    	
    	for(int i=0; i<n; i++) {
    		String line = br.readLine();
    		for(int j=0; j<m; j++) {
    			board[i][j] = line.charAt(j) - '0';
    		}
    	}
    	
    	System.out.println(bfs(0, 0));
    }
}