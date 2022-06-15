package 커뮤러닝.week3;

import java.util.*;

class Position {
    int x;
    int y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BFS1 {
	public static int solution(int[][] maps) {
        int answer = -1;
        int xl = maps.length;
        int yl = maps[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        boolean[][] visited = new boolean[xl][yl];

        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(0, 0));
        visited[0][0] = true;

        // BFS
        while(!queue.isEmpty()) {
            Position p = queue.poll();
            if(p.x==xl-1 && p.y == yl-1) return maps[p.x][p.y];
            for(int[] d : directions) {
                int nx = p.x+d[0];
                int ny = p.y+d[1];
                if(nx<0 || nx>=xl || ny<0 || ny>=yl) continue;
                if(maps[nx][ny]==1 && !visited[nx][ny]){
                    maps[nx][ny] = maps[p.x][p.y]+1;
                    queue.offer(new Position(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		int[][] maps = {
				 {1, 0, 1, 1, 1}
				,{1, 0, 1, 0, 1}
				,{1, 0, 1, 1, 1}
				,{1, 1, 1, 0, 1}
				,{0, 0, 0, 0, 1}
				};
		
		System.out.println(solution(maps));
		
	}

}
