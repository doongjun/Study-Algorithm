package ex07;

import java.util.Scanner;

public class Example10_1 {
	static int n, m, answer = 0;
	static int[][] graph;
	static boolean[] visited;
	
	static public void dfs(int v) {
		if(v == n) answer++;
		else {
			for(int i=1; i<=n; i++) {
				if(graph[v][i]==1 && !visited[i]) {
					visited[i] = true;
					dfs(i);
					visited[i] = false;
				}
			}
		}
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
        
        visited[1] = true;
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