package note;
import java.util.*;
//스택
public class DFS2 {
	static final int MAX_N = 10;
	static int N, E;
	static int[][] Graph = new int[MAX_N][MAX_N];
	
	static void dfs(int node) {
		boolean[] visited = new boolean[MAX_N];
		
		Stack<Integer> stack = new Stack<>();
		stack.push(node);
		
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			
			if(visited[cur]) continue;
			
			visited[cur] = true;
			System.out.println(cur + " ");
			
			for(int next=0; next<N; ++next) {
				if(!visited[next] && Graph[cur][next] != 0) {
					stack.push(next);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		E = scan.nextInt();
		
		for(int i=0; i<E; ++i) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			
			Graph[u][v] = Graph[v][u] = 1;
		}
		dfs(0);
	}

}
