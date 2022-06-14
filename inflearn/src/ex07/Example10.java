package ex07;

import java.util.Scanner;

// 경로탐색(DFS)
public class Example10 {
	static int n, m, answer = 0;
	static int[][] graph;
	static boolean[] visited;
	
	static public void dfs(int node) {
		if(node == n) {
			answer++;
			return;
		}
		
		visited[node] = true;
		for(int i=1; i<graph[node].length; i++) {
			if(graph[node][i]==1 && !visited[i]) {
				dfs(i);
			}
		}
		visited[node] = false;
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        m = scan.nextInt();
        visited = new boolean[n+1];
        graph = new int[n+1][n+1];
        for(int i=0; i<m; i++) {
        	int x = scan.nextInt();
        	int y = scan.nextInt();
        	graph[x][y] = 1;
        }
        
        dfs(1);

        System.out.println(answer);
    }
}

/* TC
*
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5
*
*/