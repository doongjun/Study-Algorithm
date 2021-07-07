package note;
import java.util.*;

//재귀 호출
public class DFS1 {
	static final int MAX_N = 10;
	static int N, E;
	static int[][] Graph = new int[MAX_N][MAX_N];
	static boolean[] visited = new boolean[MAX_N];
	
	static void dfs(int node) {
		visited[node] = true;
		System.out.println(node + " ");
		
		for(int next=0; next<N; ++next) {
			if(!visited[next] && Graph[node][next] != 0) {
				dfs(next);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		E = scan.nextInt();
		
		for(int i=0; i<E; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			
			Graph[u][v] = Graph[v][u] = 1;
		}
		dfs(0);
	}

}
