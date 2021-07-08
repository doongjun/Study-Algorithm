package note;

import java.util.*;

//나동빈
//미로 탈출
//내 풀이
public class BFS4 {
	public static int n;
	public static int m;
	public static int[][] graph = new int[1000][1000];
	public static int[][] D = {{-1,0},{1,0},{0,-1},{0,1}};
	
	public static class Point{
		Point(int row, int col, int dist){
			this.row = row;
			this.col = col;
			this.dist = dist;
		}
		int row, col, dist;
	}
	
	public static int bfs(int x, int y) {
		boolean[][] visited = new boolean[1000][1000];
		
		Queue<Point> queue = new LinkedList<>();
		visited[x][y] = true;
		queue.offer(new Point(x, y, 0));
		
		while(!queue.isEmpty()) {
			Point cur = queue.poll();
			if(cur.row==n-1 && cur.col==m-1) return cur.dist;
			
			for(int next=0; next<4; next++) {
				int nr = cur.row + D[next][0];
				int nc = cur.col + D[next][1];
				
				if(nr<0 || nr>n-1 || nc<0 || nc>m-1) continue;
				if(visited[nr][nc]) continue;
				if(graph[nr][nc]==0) continue;
				
				visited[nr][nc] = true;
				queue.add(new Point(nr, nc, cur.dist+1));
			}
				
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<n; i++) {
			String str = scan.nextLine();
			for(int j=0; j<m; j++) {
				graph[i][j] = str.charAt(j)-'0';
			}
		}
		int result = 1 + bfs(0,0);
		System.out.println(result);
		
		
	}
}
