package ex07;

import java.util.ArrayList;
import java.util.Scanner;

//경로탐색(인접리스트)
public class Example11 {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] visited;
	
	static public void dfs(int node) {
		if(node==n) answer++;
		else {
			for(int next : graph.get(node)) {
				if(!visited[next]) {
					visited[next] = true;
					dfs(next);
					visited[next] = false;
				}
			}
		}
	}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        m = scan.nextInt();
        visited = new boolean[n+1];
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++) {
        	graph.add(new ArrayList<Integer>());
        }
        for(int i=0; i<m; i++) {
        	int x = scan.nextInt();
        	int y = scan.nextInt();
        	
        	graph.get(x).add(y);
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